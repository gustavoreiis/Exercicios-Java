import java.util.Scanner;

public class Crescente2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] num = new int[5];
        int temp = 0;

        for (int j = 0; j <= 4; j++) {
            System.out.println("Digite o " + (j + 1) + "° número");
            num[j] = scanner.nextInt();
        }

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (num[i] < num[j]) {
                    temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }

        for (int x = 0; x <= 4; x++) {
            System.out.println(num[x]);
        }
    }
}
