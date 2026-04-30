package POO.Exemplo03;

public class CartaoCredito extends ModeloPgamento {
    @Override
    public void pagarAvista() {
        super.pagarAvista();
        System.out.println("Pagando com Cartão de Crédito!");
    }
}