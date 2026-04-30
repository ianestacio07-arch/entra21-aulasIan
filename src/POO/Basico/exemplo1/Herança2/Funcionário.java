package POO.Basico.exemplo1.Herança2;

public class Funcionário {
    private String nome;
    private Double salarioBase;

    public Funcionário(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;

    }

    public String getNome() {
        return nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }
}
