import java.util.Scanner;

public class MaiorElemento {
    public static void main(String[] args) {
        int tamanho = 0;
        int[] vetor;
        int maior = 0;
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
            if (i == 0) {
                maior = vetor[0];
            } else if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("O maior elemento do vetor é: " + maior + ".");
    }
}
