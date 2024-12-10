package one.oop.animal;

public class Cachorro extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("Au Au");
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
}
