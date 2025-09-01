public class Animal {
    private String nome;
    private String sexo;
    private String raca;

    public Animal (String nome, String sexo, String raca) {
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
    }
    public void dormir() {
        System.out.println("dormindo");
    }
    public void caminhar() {
        System.out.println("caminhando");
    }
    public void correr () {
        System.out.println("correndo");
    }
    public void emitirSom() {
        System.out.println("emitindo som");
    }
}
