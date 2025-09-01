public class Home implements Computador {

    @Override
    public void ligar() {
        System.out.println("Computador Home ligando...");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando o computador Home...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o computador Home...");
    }

    @Override
    public void carregandoSistema() {
        System.out.println("Carregando sistema operacional para uso doméstico...");
    }
}
