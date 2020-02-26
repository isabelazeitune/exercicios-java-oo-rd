package exercicio01;

import java.lang.reflect.Array;
import java.util.*;

public class Fibonacci {

    /**
     * Retorna um array contendo uma sequencia de números inteiros de Fibonacci.
     *
     * A sequencia de Fibonacci é aquela em que o valor do próximo número é igual a soma dos dois números
     * anteriores, começando por 1 e 2.
     *
     * Ex.:
     * Uma sequência Fibonacci de tamanho 10:
     *
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
     *
     * @param tamanho Tamanho da sequencia de números de Fibonacci a ser retornada.
     * @return int[]
     */
    public List<Integer> getSequenciaFibonacciDe(int tamanho) {
        // TODO: implemente o código deste método
        // return null;
        List<Integer> lista = new ArrayList<>();
        int n = 0;
        int m = 1;
        int o = 0;
        for (int i=1; i<=tamanho; i++) {
            n = o + m;
            lista.add(n);
            o = m;
            m = n;
        }
        return lista;
    }
}
