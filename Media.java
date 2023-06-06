import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        int tamanho = 0;
        int[] vetor;
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantos elementos  vetor terá: ");
        tamanho = scanner.nextInt();
        while (tamanho <= 0) {
            System.out.println("Valor inválido. Informe quantos elementos o vetor terá: ");
            tamanho = scanner.nextInt();
        }
        vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println((i + 1) + "° valor: ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }

        double media = (double) soma / tamanho;

        System.out.println("A média dos elementos do vetor é: " + media);
    }
}
