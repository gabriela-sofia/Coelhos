public class Coelho {
    private String cor;
    private int idade;
    private double peso;

    public Coelho() {
        this.cor = "Branco";
        this.idade = 1;
        this.peso = 1.4;
    }

    public Coelho(String cor, int idade, double peso) {
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
    }

    public void som() {
        System.out.println("O coelho faz barulho.");
    }

    public void correr() {
        System.out.println("O coelho está correndo.");
    }
}
