package Marcelo.B4.AT09;

public class Main {
    public static void main(String[] args) {
        CursoPresencial presencial = new CursoPresencial("Programação em Java", 40);
        CursoOnline online = new CursoOnline("Banco de Dados", 20);

        System.out.println("--- CURSO PRESENCIAL ---");
        presencial.exibirDados();
        System.out.println("Valor Total: R$ " + presencial.calcularValor());
        presencial.emitirCertificado("Carlos Silva");

        System.out.println("\n--- CURSO ON-LINE ---");
        online.exibirDados();
        System.out.println("Valor Total: R$ " + online.calcularValor());
        online.emitirCertificado("Ana Souza");
    }
}
