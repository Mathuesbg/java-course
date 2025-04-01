package exercise4;

public class Moto extends Veiculo{
    
    int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Marca : " + marca);
        System.out.println("Modelo : " + modelo);
        System.out.println("Ano : " + ano);
        System.out.println("Cilindradas : " + cilindradas);
    
    }
}
