public class Principal {
    public static void main(String[] args) {
        Jornada funcionarioJornada = new Jornada(1L, "João", "123456789", 101, "Rua A", 50.0, 160);
        Horista funcionarioHorista = new Horista(2L, "Maria", "987654321", 102, "Rua B", 60.0, 150);
        PessoaJuridica funcionarioPJ = new PessoaJuridica(3L, "Empresa X", "1122334455", 103, "Rua C", 10000.0, 2000.0);

        funcionarioJornada.calculaSalario();
        funcionarioHorista.calculaSalario();
        funcionarioPJ.calculaSalario();
    }
}
