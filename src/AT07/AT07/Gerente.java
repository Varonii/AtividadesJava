package AT07.AT07;

public class Gerente extends Funcionario {
    private double valorBonus;

    public Gerente(String nome, int matricula, double salarioBase, double valorBonus) {
        super(nome, matricula, salarioBase);
        setValorBonus(valorBonus);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        if (valorBonus < 0) {
            System.out.println("ERRO: O valor do bônus não pode ser negativo.");
        } else {
            this.valorBonus = valorBonus;
        }
    }

    public void realizarReuniao() {
        System.out.println("O gerente " + getNome() + " está realizando uma reunião.");
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + valorBonus;
    }
}