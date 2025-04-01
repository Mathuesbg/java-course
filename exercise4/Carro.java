package exercise4;

public class Carro extends Veiculo {

    int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {

        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;

    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Marca : " + marca);
        System.out.println("Modelo : " + modelo);
        System.out.println("Ano : " + ano);
        System.out.println("Numero de portas : " + numeroPortas);
    }
}