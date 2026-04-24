package poo.basico.exemplo1;

public class Pessoa {

    String nome;
    int idade;
    Double peso;

    void apresentar() {
        System.out.println("Olá meu nome é: " + this.nome);
        System.out.println("Minha idade é: " + this.idade);
        System.out.println("Meu peso é: " + this.peso);
        System.out.println();
    }
}
