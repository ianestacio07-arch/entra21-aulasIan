package POO.Basico.exemplo1.Polimorfismo;

public class principal {
    public static void main(String[] args) {
        Animal rex = new Cachorro();

        rex.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.perseguindoCarteiro();



    }
}
