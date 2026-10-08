package Marcelo.B3.AT12;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo com a extensão: ");
        String entrada = sc.nextLine().trim();

        if (entrada.isEmpty()) {
            System.out.println("Erro: O nome do arquivo está vazio.");
        } else {
            boolean ehPdf = entrada.toLowerCase().endsWith(".pdf");

            String nomeMinusculo = entrada.toLowerCase();

            int ultimoPonto = entrada.lastIndexOf(".");
            String nomeSemExtensao = (ultimoPonto > 0) ? entrada.substring(0, ultimoPonto) : entrada;

            String nomeComUnderline = entrada.replace(" ", "_");

            System.out.println("Nome em minúsculas: " + nomeMinusculo);
            System.out.println("Possui extensão .pdf: " + (ehPdf ? "Sim" : "Não"));
            System.out.println("Nome sem extensão: " + nomeSemExtensao);
            System.out.println("Nome formatado (com _): " + nomeComUnderline);
        }

        sc.close();
    }
}