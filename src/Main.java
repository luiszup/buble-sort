    /*
     * ALGORITMO BubbleSort(lista):
     *
     * PARA i DE 0 ATÉ tamanho(lista) - FAÇA
     *    PARA j DE 0 ATÉ tamanho(lista) - i - FAÇA
     *        SE lista[j] > lista[j + 1] ENTÃO
     *            // Troca os elementos
     *            temp <- lista[j]
     *            lista[j] <- lista[j + 1]
     *            lista[j + 1] <- temp
     *        FIM SE
     *    FIM PARA
     * FIM PARA
     * FIM ALGORITMO
     *
     * 1 - O algoritmo percorre a lista várias vezes.
     * 2 - Em cada iteração, compara elementos adjacentes.
     * 3 - Se o elemento atual for maior que o próximo, eles são trocados.
     * 4 - Após cada iteração externa, o maior elemento "flutua" para o final da lista.
     * 5 - O processo continua até que a lista esteja ordenada.
     */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}