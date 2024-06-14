import java.util.List;
import java.util.Scanner;


public class EventService {

    UserInteract userInteract = new UserInteract();
    UserService userService = new UserService();

    public boolean validaIngressos(Evento evento){
        if(evento != null)
            if(evento.ingressos < 1) return false;
        return true;
    }

    public Evento comprarIngresso(Evento evento) {
       evento.ingressos--;
        return evento;
    }

    public Evento acessarPosicao(List<Evento> lista, int num) {
        return lista.get(num);
    }

    public int pegaIndexDoEvento(List<Evento> evento, Scanner leitor) {
        userInteract.mostrarEventos(evento);
        return leitor.nextInt();
    }

    public Evento escolherEvento(List<Evento> lista, Usuario usuario, Scanner leitor) {

        if(userInteract.validaEvento(lista)){
            Evento eventoselecionado = validaPermiteMenoresDe18(lista, usuario, leitor);
            if(!validaIngressos(eventoselecionado)) {
                userInteract.acabouIngressos();
                return null;
            };
            if(eventoselecionado != null){
                userInteract.compraExecutadaComSucesso();
                userService.compraIngresso(usuario);
                return comprarIngresso(eventoselecionado);
            }
        }
        return null;
    }

    public Evento validaPermiteMenoresDe18(List<Evento> evento, Usuario menorInfrator, Scanner leitor) {

        Evento cassinoClandestino = acessarPosicao(evento, pegaIndexDoEvento(evento, leitor)-1);

        if (!cassinoClandestino.permiteMenoresDe18) {
            if (!menorInfrator.ehMaiorde18) {
                userInteract.casaCaiuVagabundo();
                return null;
            }
        }
        return cassinoClandestino;
    }
}
