package exercise4;


public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagen", "Tera", 2025, 4);
        Moto moto = new Moto("honda", "CG 160 Titan", 2025, 160);


        carro.exibirDetalhes();
        moto.exibirDetalhes();
    }
}
