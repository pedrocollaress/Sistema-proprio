import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        List<Usuario> usuarios = new ArrayList<>();
        List<Evento> eventos = new ArrayList<>();

        UserInteract userInteract = new UserInteract();
        UserService userService = new UserService();
        EventService eventService = new EventService();


        Scanner leitor = new Scanner(System.in);

        while(true) {


            switch (userInteract.mostrarMenu(leitor)) {
                case 1 ->
                        usuarios.add(new Usuario(userInteract.pedirNome(leitor),
                                userInteract.pedirSeEhMaiorDe18(leitor)));

                case 2 ->
                        eventos.add(new Evento(userInteract.pedirNome(leitor),
                        userInteract.pedirLocal(leitor),
                        userInteract.pedirData(leitor),
                        userInteract.pedirSePodeMenorDe18(leitor),
                        userInteract.pedirIngressos(leitor)));

                case 3 ->
                        usuarios.stream()
                        .forEach(System.out::println);

                case 4 ->
                        eventos.stream()
                        .forEach(System.out::println);

                case 5 -> {
                    userService.escolherUsuario(usuarios, leitor);
                    eventService.escolherEvento(eventos, leitor);
                }


                case 6 ->
                    usuarios.stream()
                            .filter(usuario -> usuario.ingressos >= 1)
                            .map(usuario -> usuario.nome)
                            .forEach(System.out::println);

            }
        }

    }
}