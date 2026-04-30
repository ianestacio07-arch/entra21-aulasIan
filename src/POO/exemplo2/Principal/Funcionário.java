package POO.exemplo2.Principal;

public class Funcionário {
    private double salarioBase;

    public double getSalarioBase() {
        return salarioBase;

    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularPagamento() {
        return this.salarioBase;
    }
}
