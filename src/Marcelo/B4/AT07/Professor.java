package Marcelo.B4.AT07;

public class Professor extends Funcionario implements Registravel{
    private int quantidadeHoras;
    private double valorHora;

    public Professor(String nome, int matricula, int quantidadeHoras, double valorHora) {
        super(nome, matricula);
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return quantidadeHoras * valorHora;
    }

    @Override
    public void registrarPresenca() {
        System.out.println("Presença do Professor registrada com sucesso!");
    }

}
