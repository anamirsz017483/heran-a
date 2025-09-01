public class Jornada extends Funcionario {
        double salarioHora;
        double horasTrabalhadas;

        public Jornada(long id, String nome, String telefone, int matricula, String endereco,
                       double salarioHora, double horasTrabalhadas) {
            super(id, nome, telefone, matricula, endereco);
            this.salarioHora = salarioHora;
            this.horasTrabalhadas = horasTrabalhadas;
        }
        @Override
        public void calculaSalario() {
            double salario = salarioHora * horasTrabalhadas;
            System.out.println("Salário Funcionário Jornada: " + salario);
        }
    }


