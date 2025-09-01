public class Funcionario {
        long id;
        String nome;
        String telefone;
        int matricula;
        String endereco;

        public Funcionario(long id, String nome, String telefone, int matricula, String endereco) {
            this.id = id;
            this.nome = nome;
            this.telefone = telefone;
            this.matricula = matricula;
            this.endereco = endereco;
        }

        public void calculaSalario() {
            System.out.println("Salário calculado na superclasse.");
        }
    }


