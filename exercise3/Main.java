package exercise3;
class Main { 

    public static void main(String[] args) {

        int[] estoque = {5, 3, 1, 4, 0, 7}; // Exemplo de estoque para teste

        for (int item : estoque) {
        if (item == 0) {

            System.out.println("Erro: produto fora de estoque. Revisar o estoque.");
            break;
        }

        if (item < 3) {
            continue;
        }
        System.out.println("Produto " + item + " qualificado para promoção leve 3 e pague 2.");
        } 
    }
}