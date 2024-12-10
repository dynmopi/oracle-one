package one.oop.carro;

public class CarroTeste {
    public static void main(String[] args){

        Carro qualquerCarro = new Carro();
        qualquerCarro.definirModelo("Sedan");
        qualquerCarro.definirPrecos(20000, 10000, 40000);
        qualquerCarro.exibirInfo();


//        System.out.println(qualquerCarro.getModelo());

    }
}
