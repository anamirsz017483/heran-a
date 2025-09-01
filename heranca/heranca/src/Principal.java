
public class Principal {
    public static void main (String [] args){

        VeiculoAutomovel veiculoAutomovel= new VeiculoAutomovel ("Toyota", "Etios", 2012, "Cinza", 4, "1.5");
        System.out.println ("--------Veículo Automóvel--------");
        System.out.println ("Marca: "+ veiculoAutomovel.getMarca());
        System.out.println ("Modelo: " + veiculoAutomovel.getModelo());
        System.out.println ("Ano: "+ veiculoAutomovel.getAno());
        System.out.println ("Cor: " + veiculoAutomovel.getCor());
        System.out.println ("Número de portas: "+ veiculoAutomovel.getNumeroPortas());
        System.out.println ("Motor: "+ veiculoAutomovel.getMotor());


        VeiculoMoto veiculoMoto= new VeiculoMoto("Kawasaki", "Ninja 500", 2024, "Verde", 451);
        System.out.println ("--------Veículo Moto--------");
        System.out.println ("Marca: "+ veiculoMoto.getMarca());
        System.out.println ("Modelo: " + veiculoMoto.getModelo());
        System.out.println ("Ano: "+ veiculoMoto.getAno());
        System.out.println ("Cor: " + veiculoMoto.getCor());
        System.out.println ("Cilindradas: "+ veiculoMoto.getCilindradas());

    }
}
