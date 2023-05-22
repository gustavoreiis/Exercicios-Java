import java.util.Scanner;

class NumeroPrimo {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro para descobrir se é primo: ");
        numero = scanner.nextInt();

        for (int x = 1; x <= numero; x++) {
            if (numero % x == 0) {
                contador += 1;
            }
        }

        if (contador == 2 || numero == 1) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
    }
}
