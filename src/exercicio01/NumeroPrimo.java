package exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class NumeroPrimo {

    /**
     * Retorna um conjunto contendo os números primos contidos num conjunto de inteiros passado no parâmetro,
     *
     * OBSERVAÇÃO: Um número primo é aquele número inteiro ímpar que somente é divisível por 1 e por ele mesmo.
     *
     * OBSERVAÇÃO 2: O número 2 é o único número inteiro par que é primo.
     *
     * Ex.: O número 5 é primo porque não é divisível por 3 (o resultado da divisao de 5 por 3 dá um numero decimal),
     * somente por 1 e o próprio 5.
     *
     * @param numeros Conjunto de inteiros
     * @return Set<Integer>
     */
    public List<Integer> getNumerosPrimosDe(List<Integer> numeros) {
        // TODO: implemente o código deste método
        //return null;
        List<Integer> lista = new ArrayList();
        for(int i=0; i<numeros.size(); i++) {
            for(int j=0; j<numeros.size(); j++) {
                if(numeros.get(i)%j != 0) {
                    lista.add(numeros.get(i));
                }
            }
        }
        return lista;
    }
}
