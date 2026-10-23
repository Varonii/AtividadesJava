package Marcelo.B4.AT09;

public class CursoOnline extends Curso implements Certificavel{
    public CursoOnline(String nome, int cargaHoraria) {
        super(nome, cargaHoraria);
    }

    @Override
    public double calcularValor() {
        return getCargaHoraria() * 15.00;
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("Afirmamos que o aluno " + nomeAluno + " está certificado no curso online.");
    }
}
