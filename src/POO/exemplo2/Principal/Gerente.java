package POO.exemplo2.Principal;

public class Gerente extends Funcionário{
    @Override
    public double calcularPagamento() {
        return super.calcularPagamento() + 1_000d;
    }
}
