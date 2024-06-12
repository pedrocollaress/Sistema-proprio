import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class UserService {

    final String VALIDA_USUARIO = "Cadastre um usuario primeiro";
    final String ESCOLHE_USUARIO = "Escolha o usuario: " + "\n";

    public void validaUsuario(List<Usuario> lista){
        if (lista.isEmpty()) System.out.println(VALIDA_USUARIO);
    }

    public void mostrarUsuarios(List<Usuario> lista){
        System.out.println(ESCOLHE_USUARIO);

        Consumer<Usuario> printaComIndex =
                usuario -> {
            System.out.println((lista.indexOf(usuario)+1) + " - " + usuario);
        };
        lista.stream()
                .forEach(printaComIndex);


    }

    public void acessarPosicaoDaLista(List<Usuario> lista, int num){
            Usuario escolhido = lista.get(num);
            escolhido.ingressos++;
    }


    public void escolherUsuario(List<Usuario> usuarios, Scanner leitor){
       validaUsuario(usuarios);

        mostrarUsuarios(usuarios);

        int usuarioEscolhido = leitor.nextInt();
        acessarPosicaoDaLista(usuarios ,usuarioEscolhido-1);

    }





}
