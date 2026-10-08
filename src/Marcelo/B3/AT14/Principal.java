package Marcelo.B3.AT14;

import java.util.Scanner;

public class Principal {

    static int[][] vendas = new int[3][4];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        preencherMatriz();

        System.out.println("\n--- MATRIZ DE VENDAS ---");
        apresentarMatriz();

        System.out.println("\nTotal geral de vendas: " + somarVendas());
        System.out.println("Maior venda registrada: " + encontrarMaiorVenda());
        System.out.println("Menor venda registrada: " + encontrarMenorVenda());

        System.out.println("\n--- TOTAL POR VENDEDOR ---");
        for (int i = 0; i < vendas.length; i++) {
            System.out.println("Vendedor " + (i + 1) + ": " + somarLinha(i));
        }

        System.out.println("\n--- TOTAL POR SEMANA ---");
        for (int j = 0; j < vendas[0].length; j++) {
            System.out.println("Semana " + (j + 1) + ": " + somarColuna(j));
        }

        System.out.println("\nSoma da diagonal principal: " + somarDiagonalPrincipal());
    }

    public static void preencherMatriz() {
        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.print("Vendas do Vendedor " + (i + 1) + " na Semana " + (j + 1) + ": ");
                vendas[i][j] = sc.nextInt();
            }
        }
    }

    public static void apresentarMatriz() {
        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.print(vendas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int somarVendas() {
        int soma = 0;
        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                soma += vendas[i][j];
            }
        }
        return soma;
    }

    public static int encontrarMaiorVenda() {
        int maior = vendas[0][0];
        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                if (vendas[i][j] > maior) {
                    maior = vendas[i][j];
                }
            }
        }
        return maior;
    }

    public static int encontrarMenorVenda() {
        int menor = vendas[0][0];
        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                if (vendas[i][j] < menor) {
                    menor = vendas[i][j];
                }
            }
        }
        return menor;
    }

    public static int somarLinha(int linha) {
        int soma = 0;
        for (int j = 0; j < vendas[linha].length; j++) {
            soma += vendas[linha][j];
        }
        return soma;
    }

    public static int somarColuna(int coluna) {
        int soma = 0;
        for (int i = 0; i < vendas.length; i++) {
            soma += vendas[i][coluna];
        }
        return soma;
    }

    public static int somarDiagonalPrincipal() {
        int soma = 0;
        for (int i = 0; i < vendas.length; i++) {
            soma += vendas[i][i];
        }
        return soma;
    }
}
