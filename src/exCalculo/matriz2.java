package exCalculo;

public class matriz2 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matriz3 = new int[2][2];

        matriz1[0][0] = 1;
        matriz1[0][1] = 2;
        matriz1[1][0] = 3;
        matriz1[1][1] = 4;

        matriz2[0][0] = 9;
        matriz2[0][1] = 8;
        matriz2[1][0] = 7;
        matriz2[1][1] = 6;

        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz2.length; j++){
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        } ;

    }
}
