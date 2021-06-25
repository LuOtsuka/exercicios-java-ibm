/*Exercício 1: Crie a classe Imovel, que possui um endereço e um preço.
a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie métodos de acesso e impressão deste valor adicional.
b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de acesso e impressão para este desconto.*/

package Exercicio1;

public class Imovel {
    private String endereco;
    private float preco;

    public Imovel(String endereco, float preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {

        return endereco;
    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;
    }

    public float getPreco() {

        return preco;
    }

    public void setPreco(float preco) {

        this.preco = preco;
    }

}
