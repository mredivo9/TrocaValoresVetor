public class TrocaValoresVetor {
    public static void main(String[] args) {

        int[] vetor = {5, 10};

        System.out.println("Valores originais do vetor:");
        System.out.println("Posição 0: " + vetor[0]);
        System.out.println("Posição 1: " + vetor[1]);

        int temp = vetor[0];
        vetor[0] = vetor[1];
        vetor[1] = temp;

        System.out.println("Valores após a troca do vetor:");
        System.out.println("Posição 0: " + vetor[0]);
        System.out.println("Posição 1: " + vetor[1]);
    }
}
