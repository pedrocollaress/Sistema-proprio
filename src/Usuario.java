public class Usuario {

    // atributos
    public String nome;
    public boolean ehMaiorde18;
    public int ingressos;

    // metodo construtor
    public Usuario(String nome, boolean ehMaiorde18){
        this.nome = nome;
        this.ehMaiorde18 = ehMaiorde18;
        ingressos = 0;
    }

    // toStringao brabo
    public String toString(){
        return "Nome: " + nome + "\n" +
                (ehMaiorde18 ? "Maior de idade" : "Criança") + "\n"+
                "ingressos: " + ingressos + "\n" ;
    }

}
