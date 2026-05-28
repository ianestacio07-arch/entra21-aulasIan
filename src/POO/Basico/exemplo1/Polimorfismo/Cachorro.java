package POO.Basico.exemplo1.Polimorfismo;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        super.emitirSom();

            System.out.println("Au au");

        }
}
