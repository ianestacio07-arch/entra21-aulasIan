package POO.Exemplo03;

public class Boleto extends ModeloPgamento {
    @Override
    public void pagarAvista() {
        super.pagarAvista();
        System.out.println("Pagando com Boleto!");
    }
}