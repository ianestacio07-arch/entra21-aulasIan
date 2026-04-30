package POO.Exemplo03;

public class Pix extends ModeloPgamento {
    @Override
    public void pagarAvista() {
        super.pagarAvista();
        System.out.println("Pagando à vista com Pix!");
    }
}