package poo.basico.exemplo1;

public class Principal {

        public static void main(String[] args) {

                Pessoa pessoa1 = new Pessoa();
                pessoa1.nome = "Fernando";
                pessoa1.idade = 18;

                Pessoa pessoa2 = new Pessoa();
                pessoa2.nome = "Luigi";
                pessoa2.idade = 79;

                pessoa1.apresentar();
                pessoa2.apresentar();

                Carro carro1 = new Carro();
                carro1.ano = 1994;
                carro1.cor = "Vermelho";
                carro1.marca = "Mazda";
                carro1.modelo = "Miata MX-5";
                carro1.dono = pessoa1;

                carro1.ligar();
        }
}