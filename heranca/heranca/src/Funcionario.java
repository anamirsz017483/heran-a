public class Funcionario  extends PessoaFunc {
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }
    public double getSalario() {
        return  salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void aumentarSalario (double percentual) {
        this.salario = this.salario + (this.salario * percentual ) / 100;
    }
    public void exibirInfo() {
        super.exibirinfo();
        System.out.println("salario: R$" + salario);
    }
}
