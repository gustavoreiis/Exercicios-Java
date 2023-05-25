import java.util.Scanner;

class NumeroPrimo {
    public static void main(String[] args) {
        int numero;
        boolean primo = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro para descobrir se é primo: ");
        numero = scanner.nextInt();
        while (numero < 0) {
            System.out.println("O valor informado não é positivo. informe um valor inteiro e positivo: ");
            numero = scanner.nextInt();
        }


        for (int x = 2; x <= numero - 1; x++) {
            if (numero % x == 0) {
                primo = false;
                break;
            }
        }

        if (primo == true) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
    }
}
