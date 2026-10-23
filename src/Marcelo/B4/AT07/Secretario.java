package Marcelo.B4.AT07;

public class Secretario extends Funcionario implements Registravel{
    private double salarioMensal;

    public Secretario(String nome, int matricula, double salarioMensal) {
        super(nome, matricula);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public void registrarPresenca() {
        System.out.println("Presença do Secretário registrada no sistema!");
    }


    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}
