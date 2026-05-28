package POO.Exemplo03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo!");
        System.out.print("Digite o valor da compra: ");
        double valorDaCompra = scanner.nextDouble();

        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("[1] - Pix");
        System.out.println("[2] - Boleto");
        System.out.println("[3] - Cartão de Crédito");

        int formaDePagamento = scanner.nextInt();

        Carrinho carrinho = new Carrinho(valorDaCompra);

        switch (formaDePagamento) {
            case 1:
                carrinho.realizarCompra(new Pix());
                break;
            case 2:
                carrinho.realizarCompra(new Boleto());
                break;
            case 3:
                carrinho.realizarCompra(new CartaoCredito());
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}