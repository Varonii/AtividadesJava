package Marcelo.B4.AT09;

public abstract class Curso {
    private String nome;
    private int cargaHoraria;

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria);
    }

    public abstract double calcularValor();

}
