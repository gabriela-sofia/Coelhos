public class Main {
    public static void main(String[] args) {
        Coelho coelho1 = new CoelhoBunny("Rosa", 2, 1.5, "Longa");
        Coelho coelho2 = new CoelhoSilvestre("Marrom", 3, 2.0, "Floresta");
        Coelho coelho3 = new CoelhoAnão("Branco", 1, 0.5, "Pequeno");


        if (coelho1 instanceof CoelhoBunny) {
            ((CoelhoBunny) coelho1).pular();
        }

        if (coelho2 instanceof CoelhoSilvestre) {
            ((CoelhoSilvestre) coelho2).escavar();
        }

        if (coelho3 instanceof CoelhoAnão) {
            ((CoelhoAnão) coelho3).brincar();
        }


        new Main().chamarSom(coelho1);
        new Main().chamarSom(coelho2);
        new Main().chamarSom(coelho3);
    }


    public void chamarSom(Coelho coelho) {
        coelho.som();
    }
}
