
    public class Horista extends Funcionario {
        double valorHora;
        double quantidadeHoras;
        public Horista(long id, String nome, String telefone, int matricula, String endereco,
                       double valorHora, double quantidadeHoras) {

            super(id, nome, telefone, matricula, endereco);
            this.valorHora = valorHora;
            this.quantidadeHoras = quantidadeHoras;
        }
        @Override
        public void calculaSalario() {
            double salario = valorHora * quantidadeHoras;
            System.out.println("Salário Funcionário Horista: " + salario);
        }
    }


