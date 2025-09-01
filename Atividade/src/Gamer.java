public class Gamer implements Computador {

    @Override
    public void ligar() {
        System.out.println("Computador Gamer ligando com alto desempenho...");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando o computador Gamer...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o computador Gamer...");
    }

    @Override
    public void carregandoSistema() {
        System.out.println("Carregando sistema operacional com configurações Gamer...");
    }
}
