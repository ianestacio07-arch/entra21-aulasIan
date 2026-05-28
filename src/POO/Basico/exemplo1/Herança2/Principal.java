package POO.Basico.exemplo1.Herança2;

public class Principal {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Jean", 10000.0, 500000.0);

        System.out.println("O salário total de "
                + vendedor.getNome()
                + " é "
                + vendedor.getSalarioBase());
    }
}