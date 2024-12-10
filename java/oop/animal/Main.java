package one.oop.animal;
import one.oop.animal.Animal;

public class Main {
    public static void main(String[] args){
        Animal animalGenerico = new Animal();
        animalGenerico.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();


        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }

}
