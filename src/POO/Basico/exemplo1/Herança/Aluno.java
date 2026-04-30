package POO.Basico.exemplo1.Herança;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super( nome, idade);
        this.matricula = matricula;
    }

    public void apresentar() {
        System.out.println("Meu nome é: " + super.getNome() + " e sou aluno");
    }
}