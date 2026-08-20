package AT07.AT07;

public class Funcionario {
    private String nome;
    private int matricula;
    private double salarioBase;

    public Funcionario(String nome, int matricula, double salarioBase) {
        setNome(nome);
        setMatricula(matricula);
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("ERRO: O nome não pode ficar vazio.");
            this.nome = "Sem Nome";
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        } else {
            System.out.println("ERRO: A matrícula deve ser maior que zero.");
        }
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase > 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("ERRO: O salário-base deve ser maior que zero.");
        }
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void apresentarDados() {
        System.out.println("----------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Salário Base: R$ %.2f%n", salarioBase);
    }
}