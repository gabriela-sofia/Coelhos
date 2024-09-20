public class CoelhoSilvestre extends Coelho {
    private String habitat;

    public CoelhoSilvestre(String cor, int idade, double peso, String habitat) {
        super(cor, idade, peso);
        this.habitat = habitat;
    }

    public void som() {
        System.out.println(" Coelho Silvestre faz 'Chiado Silvestre'.");
    }


    public void escavar() {
        System.out.println(" Coelho Silvestre está escavando.");
    }
}
