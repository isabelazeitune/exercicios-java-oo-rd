package exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Exercicio01 {

    public static void main(String[] args) {

        int tamanho = 10;

        List<Integer> fibonacci = new Fibonacci().getSequenciaFibonacciDe(tamanho);

        List<Integer> primos = new NumeroPrimo().getNumerosPrimosDe(getSetDe(fibonacci));

        System.out.println("Os numeros primos da sequencia Fibonacci de "+tamanho+" sao:");
        for (Integer primo: primos) {
            System.out.println(primo);
        }

    }

    /**
     * Este método deve retornar um conjunto contendo os números que vieram no array de inteiros passado no parâmetro.
     *
     * @param numeros Array de inteiros
     * @return Set<Integer>
     */
    private static List<Integer> getSetDe(List<Integer> numeros) {
        // TODO: implemente o código deste método
        //return null;
        List<Integer> lista = new ArrayList<>();
        for(int i=0; i<=numeros.size(); i++) {
            lista.add(numeros.get(i));
        }
        return lista;
    }
}
