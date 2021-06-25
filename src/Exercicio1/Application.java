package Exercicio1;

public class Application {
    public static void main(String[] args) {

        Imovel casa = new Imovel("Rua X, Bairro Y", 250000.00f);

        Novo casaNova = new Novo("Rua A, Bairro Z",250000, 50000);

        Velho casaVelha = new Velho("Rua B, Bairro C", 250000, 50000);

        System.out.println("O preco do imovel normal é R$" + casa.getPreco());

        casaNova.adicionarPreco();

        casaVelha.descontarPreco();

    }
}
