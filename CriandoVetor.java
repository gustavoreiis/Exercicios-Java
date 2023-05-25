import java.util.Scanner;

public class CriandoVetor {
    public static void main(String[] args) {
        int tamanho;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira  tamanho do valor: ");
        tamanho = scanner.nextInt();
        while (tamanho < 0) {
            System.out.println("O valor informado não é positivo. informe um valor inteiro e positivo: ");
            tamanho = scanner.nextInt();
        }

        int [] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println((i + 1) + "° Valor: ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);

        }
    }
}
