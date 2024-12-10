package one.oop.primo;

public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int ultimoPrimoConhecido) // adere o numero 17, sendo o numero já pré-estabelecido na classe Principal

    {
        int proximoNumero = ultimoPrimoConhecido + 1;
        // proximoNumero = 17 + 1

        /* nesse laço de repetição, o numero 18 entrará em teste, caso ele seja primo, o method dessa classe GeradorPrimo, retornará esse numero. Como que matematicamente não é o caso, por retornar false, a estrutura while negará de false para true, fazendo com que ele entre em looping somando com a variavel proximoNumero; quando chegar em um numero primo, o teste dará true - de acordo com os testes da classe NumerosPrimos; e essa negação trocará o valor booleano, sendo false. Assim o teste finalizará dando retorno para esse novo numero primo. Se é 17, o programa ira debugar: 18, 19.
        19 é o numero retornado*/

        while(!verificarPrimalidade(proximoNumero)){
            proximoNumero++;
        }
        return proximoNumero;
    }

}
