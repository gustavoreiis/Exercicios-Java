public class Matriz {
    public static void main(String[] args) {
        String [][] matriz = new String[6][4];

        matriz[0][0] = "Ana";
        matriz[0][2] = "Paulo";
        matriz[1][0] = "Rosa";
        matriz[1][1] = "Cléo";
        matriz[1][3] = "Rui";
        matriz[2][2] = "João";
        matriz[2][3] = "Sonia";
        matriz[3][1] = "Mari";
        matriz[4][0] = "Rony";
        matriz[4][3] = "José";
        matriz[5][1] = "Jonas";
        matriz[5][2] = "Lucy";

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
