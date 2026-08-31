package AT12;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.print("Digite a palavra a ser procurada: ");
        String palavra = sc.nextLine();

        String fraseLower = frase.toLowerCase();
        String palavraLower = palavra.toLowerCase();

        int primeiraOcorrencia = fraseLower.indexOf(palavraLower);
        int ultimaOcorrencia = fraseLower.lastIndexOf(palavraLower);

        if (primeiraOcorrencia != -1) {
            System.out.println("A palavra foi encontrada na frase!");
            System.out.println("Posição da primeira ocorrência (índice): " + primeiraOcorrencia);
            System.out.println("Posição da última ocorrência (índice): " + ultimaOcorrencia);
        } else {
            System.out.println("A palavra não foi encontrada na frase.");
        }

        sc.close();
    }
}