package POO.Exemplo03;

public class Carrinho {
    private double valorCompra;

    public Carrinho(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void realizarCompra(ModeloPgamento metodoPagamento) {
        metodoPagamento.pagarAvista();
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Compra realizada com sucesso!");
    }
}