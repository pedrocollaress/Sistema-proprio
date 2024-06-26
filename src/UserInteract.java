import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class UserInteract {


    final String ACABOU_INGRESSOS = "nao foi possivel adquirir pois os ingresos estao esgotados";
    final String CASA_CAIU = "não foi possivel comprar ingresso pq tu e menor de idade";
    final String COMPRA_COM_SUCESSO = "Compra executada com sucesso" + "\n";
    final String ESCOLHE_EVENTO = "Escolha o evento:" + "\n";
    final String VALIDA_EVENTO = "Cadastre um evento primeiro";
    final String ESCOLHE_USUARIO = "Escolha o usuario: " + "\n";
    final String VALIDA_USUARIO = "Cadastre um usuario primeiro";
    final String PEDIR_NOME = "Digite o nome:";
    final String PEDIR_IDADE = "Digite a sua idade:";
    final String PEDIR_LOCAL = "Digite o local do evento:";
    final String PEDIR_DATA = "Escreva a data por extenso:";
    final String PEDIR_SE_PODE_MENOR_DE_18 = "Digite 1 se menores de idade estão habilitados a comparecer, e 0 se nao estão:";
    final String PEDIR_INGRESSOS = "Digite a quantidade de ingressos disponíveis:";
    final String MENU = """
                ========== Menu ===========
                1 - Cadastrar usuário
                2 - Cadastrar eventos
                3 - Listar usuarios
                4 - Listar eventos
                5 - Comprar ingresso
                6 - Quais usuarios compraram ingresso
                0 - Sair
                 ==========================""";




    public int mostrarMenu(Scanner leitor){
        System.out.println(MENU);
        int opcaoMenu = leitor.nextInt();
        leitor.nextLine();
        return opcaoMenu;
    }


    public String pedirNome(Scanner leitor){
        System.out.println(PEDIR_NOME);
        return leitor.nextLine();
    }

    public boolean pedirSeEhMaiorDe18(Scanner leitor){
        System.out.println(PEDIR_IDADE);
        if(leitor.nextInt() >= 18) return true;
        return false;
    }

    public String pedirLocal(Scanner leitor){
        System.out.println(PEDIR_LOCAL);
        return leitor.nextLine();
    }

    public String pedirData(Scanner leitor){
        System.out.println(PEDIR_DATA);
        return leitor.nextLine();
    }

    public boolean pedirSePodeMenorDe18(Scanner leitor){
        System.out.println(PEDIR_SE_PODE_MENOR_DE_18);
        if(leitor.nextInt() == 1) return true;
        return false;
    }
    public int pedirIngressos(Scanner leitor){
        System.out.println(PEDIR_INGRESSOS);
        return leitor.nextInt();
    }

    public boolean validaUsuario(List<Usuario> lista){
        if (lista.isEmpty()) {
            System.out.println(VALIDA_USUARIO);
            return false;
        };
        return true;
    }

    public void mostrarUsuarios(List<Usuario> lista){
        System.out.println(ESCOLHE_USUARIO);

        Consumer<Usuario> printaComIndex =
                usuario -> {
                    System.out.println((lista.indexOf(usuario)+1) + " - "+ "\n" + usuario);
                };
        lista.forEach(printaComIndex);
    }

    public boolean validaEvento(List<Evento> lista){
        if (lista.isEmpty()) {
            System.out.println(VALIDA_EVENTO);
            return false;
        };
        return true;
    }

    public void mostrarEventos(List<Evento> lista){
        System.out.println(ESCOLHE_EVENTO);

        Consumer<Evento> printaComIndex =
                evento -> {
                    System.out.println((lista.indexOf(evento)+1) + " - " + "\n" + evento);
                };
        lista.stream()
                .forEach(printaComIndex);
    }

    public void compraExecutadaComSucesso(){
        System.out.println(COMPRA_COM_SUCESSO);
    }

    public void casaCaiuVagabundo(){
        System.out.println(CASA_CAIU);
    }


    public void acabouIngressos(){
        System.out.println(ACABOU_INGRESSOS);
    }
}



