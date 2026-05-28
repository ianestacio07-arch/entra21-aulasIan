package POO.exemplo2.Principal;

public class Vendedor extends Funcionário{
    private double comissao;

    public Vendedor(double salarioBase, double comissao) {
        super.setSalarioBase(salarioBase);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento() + this.comissao;
    }
}
