package AT13.Formales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        Circulo circulo = new Circulo("Círculo", raio);

        System.out.println("--------------------");

        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        Retangulo retangulo = new Retangulo("Retângulo", base, altura);

        System.out.println("\n=== Resultados ===");
        circulo.apresentarDados();
        System.out.println("--------------------");
        retangulo.apresentarDados();

        sc.close();
    }
}