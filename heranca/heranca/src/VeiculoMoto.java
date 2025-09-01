public class VeiculoMoto extends  Veiculo {
    private int cilindradas;

    public VeiculoMoto(String marca, String modelo, int ano, String cor, int cilindradas) {
        super(marca, modelo, ano, cor);
        this.cilindradas=cilindradas;
    }
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
