package Exercicio1;

public class Novo extends Imovel{
    private float adicional;

    public Novo(String endereco, float preco, float adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }

    public void adicionarPreco(){
        super.setPreco(super.getPreco() + this.adicional) ;

        System.out.println("O preco do imovel novo é R$" + super.getPreco());
    }
}
