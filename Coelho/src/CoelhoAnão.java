public class CoelhoAnão extends Coelho {
    private String tamanho;

    public CoelhoAnão(String cor, int idade, double peso, String tamanho) {
        super(cor, idade, peso);
        this.tamanho = tamanho;
    }

    public void som() {
        System.out.println(" Coelho Anão faz 'Chiado Anão'.");
    }

    public void brincar() {
        System.out.println(" Coelho Anão está brincando.");
    }
}

