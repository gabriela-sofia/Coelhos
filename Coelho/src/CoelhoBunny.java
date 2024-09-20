public class CoelhoBunny extends Coelho {
    private String tipoDeOrelha;

    public CoelhoBunny(String cor, int idade, double peso, String tipoDeOrelha) {
        super(cor, idade, peso);
        this.tipoDeOrelha = tipoDeOrelha;
    }

    public void som() {
        System.out.println(" Coelho Bunny faz 'Chiado Bunny'.");
    }

    public void pular() {
        System.out.println(" Coelho Bunny está pulando.");
    }
}
