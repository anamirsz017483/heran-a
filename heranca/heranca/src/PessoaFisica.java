
public class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;

    public PessoaFisica(String nome, String telefone, String cpf, String rg) {
        super (nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
    }
    public String getCpf () {
        return cpf;
    }
    public void setCpf (String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return  rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public static class PessoaJuridica extends Pessoa {
        private String cnpj;

        public PessoaJuridica (String nome , String telefone, String cnpj) {
            super (nome, telefone);
            this.cnpj = cnpj;
        }
        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }
    }

    public static class Principal {
        public static void main (String [] args) {

            Pessoa pessoa = new Pessoa("Ana rosa da cruz miranda", "(11) 9999-2745");
            System.out.println("pessoa: ");
            System.out.println("nome: " + pessoa.getNome());
            System.out.println("telefone: " + pessoa.getTelefone());

            PessoaFisica pessoaFisica = new PessoaFisica("Ana rosa da cruz miranda", "(11) 9999-2745", "123.456.789-0", "300.456.989-x");
            System.out.println("\nPessoa fisica: ");
            System.out.println("nome: " + pessoaFisica.getNome());
            System.out.println("telefone: " + pessoaFisica.getTelefone());
            System.out.println("cpf: "+ pessoaFisica.getCpf());
            System.out.println("rg: " + pessoaFisica.getRg());

            PessoaJuridica pessoaJuridica = new PessoaJuridica("empresa XYZ", "(11) 8888-9999", "12.345.678/9001-23");
            System.out.println("\nPessoa juridica: ");
            System.out.println("nome: "+ pessoaJuridica.getNome());
            System.out.println("telefone: "+ pessoaJuridica.getTelefone());
            System.out.println("cnpj:" + pessoaJuridica.getCnpj());
        }
    }
}

