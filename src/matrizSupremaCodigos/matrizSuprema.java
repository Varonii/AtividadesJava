package matrizSuprema;

import java.util.Scanner;
public class matrizSuprema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam = 0;
        System.out.print("Digite o tamanho da matriz quadrada: ");
        tam = sc.nextInt();
        int escalar = 0;
        System.out.print("Digite o escalar da matriz: ");
        escalar = sc.nextInt();
        int montarMatriz = 0;

        int[][] matriz = new int[tam][tam];
        int[][] matrizEscalar = new int[tam][tam];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print("Digite o valor da posição " + i + " " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mostrar resultado(digite 1)");
        montarMatriz = sc.nextInt();

        if (montarMatriz == 1){

            System.out.println("\n");
            System.out.println("\n");
            System.out.println("---  Matriz " + tam + "x" + tam + "  ---");


            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz.length; j++){
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz.length; j++){
                    matrizEscalar[i][j] = matriz[i][j] * escalar;
                }
            }

            System.out.println("\n");
            System.out.println("\n");
            System.out.println("---  Matriz " + tam + "x" + tam + " Escalada por: " + escalar + "  ---");

            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz.length; j++){
                    System.out.print(matrizEscalar[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\n");
            System.out.println("\n");

        }else{
            System.out.println("Programa finalizado");
        }

    }
}