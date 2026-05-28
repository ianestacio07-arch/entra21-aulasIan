package POO.exemplo2.Principal;

public class Principal {
    public static void main(String[] args) {
        Funcionário gerente = new Gerente();
        gerente.setSalarioBase(10_000d);
        System.out.println("O salario do gerente é: " + gerente.calcularPagamento());

        Funcionário funcionárioComum = new Funcionário();
        funcionárioComum.setSalarioBase(3000d);
        System.out.println("O salario do gerente é: " + funcionárioComum.calcularPagamento());

        Funcionário vendedor = new Vendedor(2_000d, 3_000d);
        System.out.println("O salário do vendedor é: " + vendedor.calcularPagamento());
    }

}
