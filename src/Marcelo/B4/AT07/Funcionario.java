package Marcelo.B4.AT07;

public abstract class Funcionario {
    private String nome;
    private int matricula;

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }

    public abstract double calcularSalario();
}
