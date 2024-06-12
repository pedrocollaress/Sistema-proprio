import java.util.Scanner;

public class UserInteract {

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




}



