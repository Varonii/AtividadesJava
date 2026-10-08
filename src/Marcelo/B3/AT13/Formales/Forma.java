package Marcelo.B3.AT13.Formales;

public class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularArea() {
        return 0.0;
    }

    public void apresentarDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Área: %.2f%n", calcularArea());
    }
}
