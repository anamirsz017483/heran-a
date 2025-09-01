public class Lobo  implements  Animal{

    @Override
    public void dormir() {
        System.out.println("o lobo esta dormindo");
    }
    @Override
    public void caminhar() {
        System.out.println("o lobo esta caminhando");
    }
    @Override
    public void correr() {
        System.out.println("o lobo esta correndo");
    }
    @Override
    public void emitirSom() {
        System.out.println("o lobo esta uivando");
    }
}
