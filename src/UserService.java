import java.util.List;
import java.util.Scanner;


public class UserService {

    UserInteract userInteract = new UserInteract();


    public void acessarPosicaoDaLista(List<Usuario> lista, int num){
            Usuario escolhido = lista.get(num);
            escolhido.ingressos++;
    }

    public void escolherUsuario(List<Usuario> usuarios, Scanner leitor){

       userInteract.validaUsuario(usuarios);
       userInteract.mostrarUsuarios(usuarios);


        int usuarioEscolhido = leitor.nextInt();
        acessarPosicaoDaLista(usuarios ,usuarioEscolhido-1);

    }





}
