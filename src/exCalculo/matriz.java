package exCalculo;

public class matriz{
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int escalar = 2;

        matriz[0][0] = 1;
        matriz[1][0] = 3;
        matriz[0][1] = 2;
        matriz[1][1] = 7;
        matriz[2][0] = 8;
        matriz[2][1] = 4;
        matriz[2][2] = 5;
        matriz[0][2] = 6;
        matriz[1][2] = 0;

        // 1. Multiplica a matriz pelo escalar
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = matriz[i][j]*escalar;
            }
        }

        // 2. Imprime a matriz
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}