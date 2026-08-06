import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];
        char jogadorAtual = 'X';

        for (int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro.length; j++){
                tabuleiro[i][j] = ' ';
            }
        }

        boolean jogoAtivo = true;
        int jogadas = 0;

        while (jogoAtivo) {

            for (int i = 0; i < tabuleiro.length; i++){
                for(int j = 0; j < tabuleiro.length; j++){
                    System.out.print("|");
                    System.out.print(" " + tabuleiro[i][j] + " ");
                }
                System.out.print("|");
                System.out.println();
                if (i < 2) System.out.println("-------------");
            }

            boolean verificarPosicao = true;

            int linha = -1;

            int coluna = -1;

            while (verificarPosicao) {

                boolean valorValido = true;
                while (valorValido) {
                    System.out.print("Escolha a linha (0 a 2): ");
                    linha = sc.nextInt();
                    if (linha >= 0 && linha <= 2){
                        valorValido = false;
                    } else {
                        System.out.println("Posição invalida");
                    }
                }

                valorValido = true;
                while (valorValido) {
                    System.out.print("Escolha a coluna (0 a 2): ");
                    coluna = sc.nextInt();
                    if (coluna >= 0 && coluna <= 2){
                        valorValido = false;
                    } else {
                        System.out.println("Posição invalida");
                    }
                }
                if (tabuleiro[linha][coluna] != ' '){
                    System.out.println("Posição ocupada!");
                } else {
                    tabuleiro[linha][coluna] = jogadorAtual;
                    verificarPosicao = false;
                }
            }

            //verifica as possibilidades de vitoria
            for (int i = 0; i < tabuleiro.length; i++){
                if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual){
                    jogoAtivo = false;
                }
            }

            for (int j = 0; j < tabuleiro.length; j++){
                if (tabuleiro[0][j] == jogadorAtual && tabuleiro[1][j] == jogadorAtual &&  tabuleiro[2][j] == jogadorAtual){
                    jogoAtivo = false;
                }
            }

            if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual){
                jogoAtivo = false;
            }

            if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual){
                jogoAtivo = false;
            }

            //verifica se deu velha
            if (jogadas == 9){
                jogoAtivo = false;
                System.out.println("Deu velha!");
            }

            if (jogadorAtual == 'X'){
                jogadorAtual = 'O';
            } else {
                jogadorAtual = 'X';
            }
            jogadas += 1;

        }

        for (int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro.length; j++){
                System.out.print("|");
                System.out.print(" " + tabuleiro[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
            if (i < 2) System.out.println("-------------");
        }

        System.out.println("Fim de jogo!");
    }
}
