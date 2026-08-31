package AT12;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome completo: ");
        String entrada = sc.nextLine();

        String nome = entrada.trim();

        if (nome.isEmpty()) {
            System.out.println("Erro: Nenhum nome foi digitado.");
        } else {
            System.out.println("Nome (sem espaços nas pontas): " + nome);

            System.out.println("Nome em maiúsculas: " + nome.toUpperCase());

            System.out.println("Quantidade total de caracteres: " + nome.length());

            boolean temEspaco = nome.contains(" ");
            System.out.println("Possui espaço entre as palavras: " + (temEspaco ? "Sim" : "Não"));

            if (temEspaco) {
                System.out.println("Classificação: Foi digitado um nome completo.");
            } else {
                System.out.println("Classificação: Foi digitado apenas um nome.");
            }
        }

        sc.close();
    }
}