import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;


public class EventService {

    UserInteract userInteract = new UserInteract();


    public void acessarPosicaoEvento(List<Evento> lista, int num){
        Evento escolhido = lista.get(num);
        escolhido.ingressos--;
    }


    public void escolherEvento(List<Evento> lista, Scanner leitor){

            userInteract.validaEvento(lista);
            userInteract.mostrarEventos(lista);
            int eventoEscolhido = leitor.nextInt();
            acessarPosicaoEvento(lista, eventoEscolhido-1);
    }


}
