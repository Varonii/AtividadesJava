package Marcelo.B4.Ex1;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica r1 = new Retangulo(10, 23);
        FiguraGeometrica c1 = new Circulo(32);

        System.out.println("===== DADOS CÍRCULO =====");
        System.out.println("Área: " + r1.area());
        System.out.println("Perímetro: " + r1.perimetro());
        System.out.println();

        System.out.println("===== DADOS RETÂNGULO =====");
        System.out.println("Área: " + c1.area());
        System.out.println("Perímetro: " + c1.perimetro());
    }
}
