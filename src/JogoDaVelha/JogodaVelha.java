import java.util.Scanner;

public class jogodaVelha {
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
        boolean deuVelha = false;
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
                    System.out.print("Escolha a linha (1 2 3): ");
                    linha = sc.nextInt();
                    linha = linha - 1;
                    if (linha >= 0 && linha <= 2){
                        valorValido = false;
                    } else {
                        System.out.println("Posição invalida");
                    }
                }

                valorValido = true;
                while (valorValido) {
                    System.out.print("Escolha a coluna (1 2 3): ");
                    coluna = sc.nextInt();
                    coluna = coluna - 1;
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
            jogadas += 1;
            if (jogadas == 9 && jogoAtivo){
                deuVelha = true;
                jogoAtivo = false;
            }

            if (jogoAtivo) {
                if (jogadorAtual == 'X'){
                    jogadorAtual = 'O';
                } else {
                    jogadorAtual = 'X';
                }
            }
        }

        // Desenha o tabuleiro final
        for (int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro.length; j++){
                System.out.print("|");
                System.out.print(" " + tabuleiro[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
            if (i < 2) System.out.println("-------------");
        }

        System.out.println("---------------------------");
        System.out.println("Fim de jogo!");

        if (deuVelha) {
            System.out.println("Deu velha!");
        } else {
            char numeroJogador = (jogadorAtual == 'X') ? '1' : '2';
            System.out.println("Jogador " + numeroJogador + " venceu!!");
        }
        System.out.println("---------------------------");
    }
}