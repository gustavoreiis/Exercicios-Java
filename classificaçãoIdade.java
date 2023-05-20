import java.util.Scanner;

public class PedidoComRepetição {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int codigo, quantidade;

        System.out.println("Informe seu nome: ");
        nome = scanner.nextLine();

        System.out.println(nome + ", digite o código do lanche: ");
        codigo = scanner.nextInt();

        while (codigo < 100 || codigo > 104) {
            System.out.println("Código inválido! Informe novamente: ");
            codigo = scanner.nextInt();
        }

        System.out.println("Código válido.");
        System.out.println("Informe a quantidade de lanches: ");
        quantidade = scanner.nextInt();

        if (codigo == 100) {
            System.out.println("O valor total do pedido do Cachorro Quente é igual a: " + quantidade * 15 + " Reais.");
        } else if (codigo == 101) {
            System.out.println("O valor total do pedido do Bauru Simples é igual a: " + quantidade * 10 + " Reais.");
        } else if (codigo == 102) {
            System.out.println("O valor total do pedido do Bauru com ovo é igual a: " + quantidade * 12 + " Reais.");
        } else if (codigo == 103) {
            System.out.println("O valor total do pedido do Hamburguer é igual a: " + quantidade * 15 + " Reais.");
        } else {
            System.out.println("O valor total do pedido do Cheeseburguer é igual a: " + quantidade * 16 + " Reais.");
        }
    }
}
