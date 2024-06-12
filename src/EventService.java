import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;


public class EventService {


    final String VALIDA_EVENTO = "Cadastre um evento primeiro";
    final String ESCOLHE_EVENTO = "Escolha o evento:" + "\n";


    public void validaEvento(List<Evento> lista){
        if (lista.isEmpty()) System.out.println(VALIDA_EVENTO);
    }


    public void mostrarEventos(List<Evento> lista){
        System.out.println(ESCOLHE_EVENTO);

        Consumer<Evento> printaComIndex =
                evento -> {
                    System.out.println((lista.indexOf(evento)+1) + " - " + evento);
                };
        lista.stream()
                .forEach(printaComIndex);
    }

    public void acessarPosicaoEvento(List<Evento> lista, int num){
        Evento escolhido = lista.get(num);
        escolhido.ingressos--;
    }


    public void escolherEvento(List<Evento> lista, Scanner leitor){
            validaEvento(lista);

            mostrarEventos(lista);
            int eventoEscolhido = leitor.nextInt();

            acessarPosicaoEvento(lista, eventoEscolhido-1);
    }


}
