public class Evento {
    public String nome;
    public String local;
    public String data;
    public boolean permiteMenoresDe18;
    public int ingressos;

    public Evento(String nome, String local, String data, boolean permiteMenoresDe18,int ingressos){
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.permiteMenoresDe18 = permiteMenoresDe18;
        this.ingressos = ingressos;
    }

    public String toString(){
        return  "Nome do evento: " + nome + "\n" +
                "Sera realizado(a) em: " + local + "\n" +
                "Data: " + data + "\n" +
                "Permitida a entrada de menores de 18 anos? : " + (permiteMenoresDe18 ? "Sim" : "Não") + "\n" +
                "Ingressos disponiveis: " + ingressos +
                "\n";

    }


}
