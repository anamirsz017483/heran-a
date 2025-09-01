public class PessoaJuridica extends Funcionario {
    double valorBruto;
    double imposto;

    public PessoaJuridica(long id, String nome, String telefone, int matricula, String endereco,
                          double valorBruto, double imposto) {
        super(id, nome, telefone, matricula, endereco);
        this.valorBruto = valorBruto;
        this.imposto = imposto;
    }
    @Override
    public void calculaSalario() {
        double salario = valorBruto - imposto;
        System.out.println("Salário Funcionário Pessoa Jurídica: " + salario);
    }
}
