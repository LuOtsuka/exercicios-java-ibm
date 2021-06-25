package Exercicio1;

public class Velho extends Imovel{
    private float desconto ;

    public Velho(String endereco, float preco, float desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public void descontarPreco(){
        super.setPreco(super.getPreco() - this.desconto) ;

        System.out.println("O preco do imovel velho é R$" + super.getPreco());
    }
}
