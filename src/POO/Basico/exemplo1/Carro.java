package poo.basico.exemplo1;

public class Carro {

    String cor;
    String modelo;
    String marca;
    int ano;
    Pessoa dono;

    void ligar() {
        if (dono == null) {
            System.out.println("Carro sem dono.");
        } else {
            System.out.println("Dono do carro:");
            dono.apresentar();
            System.out.println("Carro ligado: Vruuuuum!");
        }
    }
}