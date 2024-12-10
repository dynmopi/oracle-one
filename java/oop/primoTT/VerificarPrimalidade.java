package one.oop.primoTT;

public class VerificarPrimalidade implements GetSetter {
    private int valor;

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }


    public boolean verificarPrimo() {
        int numero = getValor();

//        System.out.println(numero);
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void imprimirPrimo(){
        if (verificarPrimo()){
            System.out.println(getValor() + " é primo");
        } else {
            System.out.println(getValor() + " não é primo");
        }
    }

    public VerificarPrimalidade(int valor){
        this.valor = valor;
    }
}
