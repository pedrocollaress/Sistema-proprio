import java.util.List;
import java.util.Scanner;


public class UserService {

    UserInteract userInteract = new UserInteract();

    public Usuario compraIngresso(Usuario usuario){

        usuario.ingressos++;
        return usuario;
    }

    public Usuario acessarPosicaoDaLista(List<Usuario> lista, int num){
            return lista.get(num);
    }

    public int pegaIndexDoUsuario(List<Usuario> usuarios, Scanner leitor){
        userInteract.mostrarUsuarios(usuarios);
        return leitor.nextInt();
    }

    public Usuario escolherUsuario(List<Usuario> usuarios, Scanner leitor){
        if(userInteract.validaUsuario(usuarios))
            return acessarPosicaoDaLista(usuarios, pegaIndexDoUsuario(usuarios, leitor) - 1);
        return null;
    }





}
