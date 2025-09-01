public class Principal {
    public static void main(String[] args) {
        Computador gamer = new Gamer();
        Computador home = new Home();

        gamer.ligar();
        gamer.carregandoSistema();
        gamer.reiniciar();
        gamer.desligar();

        System.out.println();

        home.ligar();
        home.carregandoSistema();
        home.reiniciar();
        home.desligar();
    }
}




