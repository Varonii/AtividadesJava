package matrizSuprema;

import java.util.Scanner;
public class CalculadoraMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=========================================");
            System.out.println("         CALCULADORA DE MATRIZES         ");
            System.out.println("=========================================");
            System.out.println("1 - Ler e Imprimir Matriz");
            System.out.println("2 - Somar Matrizes (A + B)");
            System.out.println("3 - Subtrair Matrizes (A - B)");
            System.out.println("4 - Multiplicar por Escalar (k * A)");
            System.out.println("5 - Transposta de uma Matriz (A^T)");
            System.out.println("6 - Multiplicação de Matrizes (A * B)");
            System.out.println("7 - Gerar Matriz Identidade");
            System.out.println("8 - Verificar se é Matriz Diagonal");
            System.out.println("9 - Verificar se é Matriz Simétrica");
            System.out.println("0 - Sair");
            System.out.println("=========================================");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("\nEncerrando a Calculadora de Matrizes... Até mais!");
                    break;
                case 1: {
                    System.out.print("Digite o quantidade de linhas da matriz: ");
                    int linha = sc.nextInt();
                    System.out.print("Digite o quantidade de colunas da matriz: ");
                    int coluna = sc.nextInt();

                    int[][] matriz = new int[linha][coluna];

                    for (int i = 0; i < linha; i++) {
                        for (int j = 0; j < coluna; j++) {
                            System.out.print("Digite o valor da posição " + i + " " + j + ": ");
                            matriz[i][j] = sc.nextInt();
                        }
                    }

                    sc.nextLine();
                    System.out.print("\nPressione [ENTER] para ver o resultado");
                    sc.nextLine();

                    for (int i = 0; i < linha; i++) {
                        for (int j = 0; j < coluna; j++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                }

                case 2: {
                    System.out.print("Digite o quantidade de linhas da matriz A: ");
                    int linhaA = sc.nextInt();
                    System.out.print("Digite o quantidade de colunas da matriz A: ");
                    int colunaA = sc.nextInt();
                    int[][] matrizA = new int[linhaA][colunaA];

                    System.out.print("Digite o quantidade de linhas da matriz B: ");
                    int linhaB = sc.nextInt();
                    System.out.print("Digite o quantidade de colunas da matriz B: ");
                    int colunaB = sc.nextInt();

                    if (linhaA != linhaB || colunaA != colunaB) {
                        System.out.println("Erro: Só é possível somar matrizes com as mesmas dimensões!");
                    } else {

                        for (int i = 0; i < linhaA; i++) {
                            for (int j = 0; j < colunaA; j++) {
                                System.out.print("Digite o valor da posição " + i + " " + j + ": ");
                                matrizA[i][j] = sc.nextInt();
                            }
                        }
                        int[][] matrizB = new int[linhaB][colunaB];
                        for (int i = 0; i < linhaB; i++) {
                            for (int j = 0; j < colunaB; j++) {
                                System.out.print("Digite o valor da posição " + i + " " + j + ": ");
                                matrizB[i][j] = sc.nextInt();
                            }
                        }

                        int[][] matrizC = new int[linhaA][colunaA];
                        for (int i = 0; i < linhaA; i++) {
                            for (int j = 0; j < colunaA; j++) {
                                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                            }
                        }

                        sc.nextLine();
                        System.out.print("\nPressione [ENTER] para ver o resultado");
                        sc.nextLine();

                        System.out.println("--- Matriz A: " + linhaA + "x" + colunaA + " ---");
                        for (int i = 0; i < linhaA; i++) {
                            for (int j = 0; j < colunaA; j++) {
                                System.out.print(matrizA[i][j] + " ");
                            }
                            System.out.println();
                        }

                        System.out.println("--- Matriz B: " + linhaB + "x" + colunaB + " ---");
                        for (int i = 0; i < linhaB; i++) {
                            for (int j = 0; j < colunaB; j++) {
                                System.out.print(matrizB[i][j] + " ");
                            }
                            System.out.println();
                        }

                        System.out.println("--- Matriz Resultado: " + linhaB + "x" + colunaB + " ---");
                        for (int i = 0; i < linhaA; i++) {
                            for (int j = 0; j < colunaA; j++) {
                                System.out.print(matrizC[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;
                }

                case 3: {
                    System.out.print("Digite o quantidade de linhas da matriz A: ");
                    int linhaA = sc.nextInt();
                    System.out.print("Digite o quantidade de colunas da matriz A: ");
                    int colunaA = sc.nextInt();
                    int[][] matrizA = new int[linhaA][colunaA];

                    System.out.print("Digite o quantidade de linhas da matriz B: ");
                    int linhaB = sc.nextInt();
                    System.out.print("Digite o quantidade de colunas da matriz B: ");
                    int colunaB = sc.nextInt();

                    if (linhaA != linhaB || colunaA != colunaB) {
                        System.out.println("Erro: Só é possível subtrair matrizes com as mesmas dimensões!");
                    } else {

                        for (int i = 0; i < linhaA; i++) {
                            for (int j = 0; j < colunaA; j++) {
                                System.out.print("Digite o valor da posição " + i + " " + j + ": ");
                                matrizA[i][j] = sc.nextInt();
                            }
                        }
                        int[][] matrizB = new int[linhaB][colunaB];
                        for (int i = 0; i < linhaB; i++) {
                            for (int j = 0; j < colunaB; j++) {
                                System.out.print("Digite o valor da posição " + i + " " + j + ": ");
                                matrizB[i][j] = sc.nextInt();
                            }
                        }

                        int[][] matrizC = new int[linhaA][colunaA];
                        for (int i = 0; i < linhaA; i++) {
                            for (int j = 0; j < colunaA; j++) {
                                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
                            }
                        }

                        sc.nextLine();
                        System.out.print("\nPressione [ENTER] para ver o resultado");
                        sc.nextLine();

                        System.out.println("--- Matriz A: " + linhaA + "x" + colunaA + " ---");
                        for (int i = 0; i < linhaA; i++) {
                            for (int j = 0; j < colunaA; j++) {
                                System.out.print(matrizA[i][j] + " ");
                            }
                            System.out.println();
                        }

                        System.out.println("--- Matriz B: " + linhaB + "x" + colunaB + " ---");
                        for (int i = 0; i < linhaB; i++) {
                            for (int j = 0; j < colunaB; j++) {
                                System.out.print(matrizB[i][j] + " ");
                            }
                            System.out.println();
                        }

                        System.out.println("--- Matriz Resultado: " + linhaB + "x" + colunaB + " ---");
                        for (int i = 0; i < linhaA; i++) {
                            for (int j = 0; j < colunaA; j++) {
                                System.out.print(matrizC[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;
                }

                case 4: {
                    System.out.print("Digite o quantidade de linhas da matriz: ");
                    int linha = sc.nextInt();
                    System.out.print("Digite o quantidade de colunas da matriz: ");
                    int coluna = sc.nextInt();
                    System.out.print("Digite o escalar da matriz: ");
                    int escalar = sc.nextInt();

                    int[][] matriz = new int[linha][coluna];
                    int[][] matrizEscalar = new int[linha][coluna];

                    for (int i = 0; i < linha; i++){
                        for (int j = 0; j < coluna; j++){
                            System.out.print("Digite o valor da posição " + i + " " + j + ": ");
                            matriz[i][j] = sc.nextInt();
                        }
                    }

                    sc.nextLine();
                    System.out.print("\nPressione [ENTER] para ver o resultado");
                    sc.nextLine();

                    System.out.println("---  Matriz " + linha + "x" + coluna + "  ---");

                    for(int i = 0; i < linha; i++){
                        for(int j = 0; j < coluna; j++){
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }

                    for (int i = 0; i < linha; i++){
                        for(int j = 0; j < coluna; j++){
                            matrizEscalar[i][j] = matriz[i][j] * escalar;
                        }
                    }
                    System.out.println("\n");
                    System.out.println("---  Matriz " + linha + "x" + coluna + " Escalada por: " + escalar + "  ---");

                    for(int i = 0; i < linha; i++){
                        for(int j = 0; j < coluna; j++){
                            System.out.print(matrizEscalar[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 5: {
                    System.out.print("Digite o quantidade de linhas da matriz: ");
                    int linha = sc.nextInt();
                    System.out.print("Digite o quantidade de colunas da matriz: ");
                    int coluna = sc.nextInt();
                    int[][] matriz = new int[linha][coluna];
                    int[][] matrizT = new int[coluna][linha];

                    for (int i = 0; i < linha; i++){
                        for (int j = 0; j < coluna; j++){
                            System.out.print("Digite o valor da posição " + i + " " + j + ": ");
                            matriz[i][j] = sc.nextInt();
                        }
                    }

                    for (int i = 0; i < coluna; i++){
                        for (int j = 0; j < linha; j++){
                            matrizT[i][j] = matriz[j][i];
                        }
                    }

                    sc.nextLine();
                    System.out.print("\nPressione [ENTER] para ver o resultado");
                    sc.nextLine();

                    System.out.println("---  Matriz " + linha + "x" + coluna + "  ---");

                    for(int i = 0; i < linha; i++){
                        for(int j = 0; j < coluna; j++){
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }

                    System.out.println("---  Matriz Transposta " + coluna + "x" + linha + "  ---");

                    for(int i = 0; i < coluna; i++){
                        for(int j = 0; j < linha; j++){
                            System.out.print(matrizT[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 6: {
                    System.out.print("Digite o quantidade de linhas da matriz A: ");
                    int linhaA = sc.nextInt();
                    System.out.print("Digite o quantidade de colunas da matriz A: ");
                    int colunaA = sc.nextInt();
                    int[][] matrizA = new int[linhaA][colunaA];

                    System.out.print("Digite o quantidade de linhas da matriz B: ");
                    int linhaB = sc.nextInt();
                    System.out.print("Digite o quantidade de colunas da matriz B: ");
                    int colunaB = sc.nextInt();

                    if (colunaA != linhaB){
                        System.out.println("Multiplicação inválida. As colunas de A devem ser iguais às linhas de B.");
                    } else {
                        for (int i = 0; i < linhaA; i++) {
                            for (int j = 0; j < colunaA; j++) {
                                System.out.print("Digite o valor da posição " + i + " " + j + ": ");
                                matrizA[i][j] = sc.nextInt();
                            }
                        }
                        int[][] matrizB = new int[linhaB][colunaB];
                        for (int i = 0; i < linhaB; i++) {
                            for (int j = 0; j < colunaB; j++) {
                                System.out.print("Digite o valor da posição " + i + " " + j + ": ");
                                matrizB[i][j] = sc.nextInt();
                            }
                        }
                        int[][] matrizC = new int[linhaA][colunaB];
                        for (int i = 0; i < linhaA; i++){
                            for (int j = 0; j < colunaB; j++){
                                matrizC[i][j] = 0;
                                for (int k = 0; k < colunaA; k++){
                                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                                }
                            }
                        }

                        sc.nextLine();
                        System.out.print("\nPressione [ENTER] para ver o resultado");
                        sc.nextLine();

                        System.out.println("---  Matriz A " + linhaA + "x" + colunaA + "  ---");

                        for(int i = 0; i < linhaA; i++){
                            for(int j = 0; j < colunaA; j++){
                                System.out.print(matrizA[i][j] + " ");
                            }
                            System.out.println();
                        }

                        System.out.println("---  Matriz B " + linhaB + "x" + colunaB + "  ---");

                        for(int i = 0; i < linhaB; i++){
                            for(int j = 0; j < colunaB; j++){
                                System.out.print(matrizB[i][j] + " ");
                            }
                            System.out.println();
                        }

                        System.out.println("---  Matriz Resultado " + linhaA + "x" + colunaB + "  ---");

                        for(int i = 0; i < linhaA; i++){
                            for(int j = 0; j < colunaB; j++){
                                System.out.print(matrizC[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Digite a ordem da matriz: ");
                    int ordem = sc.nextInt();
                    int[][] matriz = new int[ordem][ordem];

                    for (int i = 0; i < ordem; i++){
                        for (int j = 0; j < ordem; j++){
                            if (i == j){
                                matriz[i][j] = 1;
                            } else {
                                matriz[i][j] = 0;
                            }
                        }
                    }

                    sc.nextLine();
                    System.out.print("\nPressione [ENTER] para ver o resultado");
                    sc.nextLine();

                    System.out.println("---  Matriz identidade " + ordem + "x" + ordem + "  ---");

                    for(int i = 0; i < ordem; i++){
                        for(int j = 0; j < ordem; j++){
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 8: {
                    System.out.println("Digite o numero de linhas da matriz: ");
                    int linha = sc.nextInt();
                    System.out.println("Digite o numero de colunas da matriz: ");
                    int coluna = sc.nextInt();
                    int[][] matriz = new int[linha][coluna];

                    if (linha != coluna){
                        System.out.println("A matriz deve ser quadrada.");
                    } else {
                        for (int i = 0; i < linha; i++) {
                            for (int j = 0; j < coluna; j++) {
                                System.out.print("Digite o valor da posição " + i + " " + j + ": ");
                                matriz[i][j] = sc.nextInt();
                            }
                        }
                        boolean ehDiagonal = true;
                        for (int i = 0; i < linha; i++){
                            for (int j = 0; j < coluna; j++){
                                if (i != j && matriz[i][j] != 0){
                                    ehDiagonal = false;
                                }
                            }
                        }

                        sc.nextLine();
                        System.out.print("\nPressione [ENTER] para ver o resultado");
                        sc.nextLine();

                        System.out.println("---  Matriz " + linha + "x" + coluna + "  ---");

                        for(int i = 0; i < linha; i++){
                            for(int j = 0; j < coluna; j++){
                                System.out.print(matriz[i][j] + " ");
                            }
                            System.out.println();
                        }

                        System.out.println();
                        if (ehDiagonal) {
                            System.out.println("\nA matriz É diagonal!");
                        } else {
                            System.out.println("\nA matriz NÃO é diagonal!");
                        }
                    }
                    break;
                }
                case 9: {
                    System.out.println("Digite o numero de linhas da matriz: ");
                    int linha = sc.nextInt();
                    System.out.println("Digite o numero de colunas da matriz: ");
                    int coluna = sc.nextInt();
                    int[][] matriz = new int[linha][coluna];

                    if (linha != coluna){
                        System.out.println("A matriz deve ser quadrada.");
                    } else {
                        for (int i = 0; i < linha; i++) {
                            for (int j = 0; j < coluna; j++) {
                                System.out.print("Digite o valor da posição " + i + " " + j + ": ");
                                matriz[i][j] = sc.nextInt();
                            }
                        }
                        boolean ehSimetrica = true;
                        for (int i = 0; i < linha; i++){
                            for (int j = 0; j < coluna; j++){
                                if (matriz[i][j] != matriz[j][i]){
                                    ehSimetrica = false;
                                }
                            }
                        }

                        sc.nextLine();
                        System.out.print("\nPressione [ENTER] para ver o resultado");
                        sc.nextLine();

                        System.out.println("---  Matriz " + linha + "x" + coluna + "  ---");

                        for(int i = 0; i < linha; i++){
                            for(int j = 0; j < coluna; j++){
                                System.out.print(matriz[i][j] + " ");
                            }
                            System.out.println();
                        }

                        System.out.println();
                        if (ehSimetrica) {
                            System.out.println("\nA matriz É simétrica!");
                        } else {
                            System.out.println("\nA matriz NÃO é simétrica!");
                        }
                    }
                    break;
                }
                default:
                    System.out.println("\nOpção inválida! Escolha um número de 0 a 9.");
                    break;
            }
        } while (opcao != 0);
    }
}