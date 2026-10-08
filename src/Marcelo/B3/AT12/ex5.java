package Marcelo.B3.AT12;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine().trim();

        if (nomeCompleto.isEmpty()) {
            System.out.println("Erro: Nenhum nome foi digitado.");
        } else {
            String[] partes = nomeCompleto.split("\\s+");

            String primeiroNome = partes[0].toLowerCase();
            String ultimoSobrenome = partes[partes.length - 1].toLowerCase();

            String usuario = primeiroNome + "." + ultimoSobrenome;

            System.out.println("Nome de usuário gerado: " + usuario);
        }

        sc.close();
    }
}