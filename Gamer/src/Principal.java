public class Principal {
    public static void main (String [] args) {

        Lobo lobo = new Lobo ("Thor", "M","Qualquer");
        lobo.emitirSom();

        Leao leao = new Leao ("Lais", "F","Qualquer" );
        leao.emitirSom();

        Tigre tigre = new Tigre ("Bidu", "M", "Qualquer");
        tigre.emitirSom();

        Cachorro cachorro = new Cachorro("Aurora", "F", "Shih Tzu");
        cachorro.emitirSom();

        Gato gato = new Gato ("layo", "M", "vira-lata");
        leao.emitirSom();
    }
}
