package POO.Basico.exemplo1.Herança2;

public class Vendedor extends Funcionário {

    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public Double getSalarioBase() {
        return super.getSalarioBase() + this.comissao;
    }
}
