package Marcelo.B3.AT14;

import java.util.Scanner;

public class Main {
    static String[] nomes = new String[5];
    static double[] notas = new double[5];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cadastrarAlunos();
        apresentarAlunos();

        double media = calcularMedia();
        double maior = encontrarMaiorNota();
        double menor = encontrarMenorNota();

        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);

        for (int i = 0; i < nomes.length; i++) {
            apresentarSituacao(nomes[i], notas[i]);
        }

        System.out.print("Procurar aluno: ");
        String nomeBusca = sc.nextLine();
        int posicao = buscarAluno(nomeBusca);
        if (posicao != -1) {
            System.out.println("Aluno encontrado na posição: " + posicao);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static void cadastrarAlunos() {
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Aluno: ");
            nomes[i] = sc.nextLine();
            System.out.print("Nota: ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    public static void apresentarAlunos() {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Aluno: " + nomes[i] + " | Nota: " + notas[i]);
        }
    }

    public static double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static double encontrarMaiorNota() {
        double maior = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }
        return maior;
    }

    public static double encontrarMenorNota() {
        double menor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        return menor;
    }

    public static int buscarAluno(String nomeProcurado) {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
                return i; // usei IA pra fazer essa parte, não sabia oque era esse equalsIgnoreCase
            }
        }
        return -1;
    }

    public static void apresentarSituacao(String nome, double nota) {
        if (nota >= 6.0) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }

}