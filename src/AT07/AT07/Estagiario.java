package AT07.AT07;

public class Estagiario extends Funcionario {
    private String instituicaoEnsino;

    public Estagiario(String nome, int matricula, double salarioBase, String instituicaoEnsino) {
        super(nome, matricula, salarioBase);
        setInstituicaoEnsino(instituicaoEnsino);
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        if (instituicaoEnsino != null && !instituicaoEnsino.trim().isEmpty()) {
            this.instituicaoEnsino = instituicaoEnsino;
        } else {
            System.out.println("ERRO: A instituição de ensino não pode ficar vazia.");
            this.instituicaoEnsino = "Não informada";
        }
    }

    public void realizarTreinamento() {
        System.out.println("O estagiário " + getNome() + " está realizando um treinamento.");
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }
}