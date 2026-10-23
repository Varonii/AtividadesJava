package Marcelo.B4.AT07;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Marcelo Yamamoto", 802039, 80, 40.00);
        Secretario secretario = new Secretario("Enzo Bombardelli", 261072086, 2500.00);

        professor.exibirDados();
        System.out.println("Salário do Professor: R$ " + professor.calcularSalario());
        professor.registrarPresenca();

        secretario.exibirDados();
        System.out.println("Salário do Secretário: R$ " + secretario.calcularSalario());
        secretario.registrarPresenca();
    }
}
