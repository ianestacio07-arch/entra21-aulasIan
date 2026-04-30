package POO.Basico.exemplo1.Polimorfismo;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        super.emitirSom();{
            System.out.println("Miau miau");
        }
    }
}
