package AT07.AT07;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana Souza", 101, 8000.00, 1500.00);
        Vendedor vendedor = new Vendedor("Carlos Silva", 102, 2500.00, 30000.00, 5.0);
        Estagiario estagiario = new Estagiario("Lucas Lima", 103, 1200.00, "Universidade Federal");

        // Execução Gerente
        gerente.apresentarDados();
        gerente.realizarReuniao();
        System.out.printf("Salário Final: R$ %.2f%n", gerente.calcularSalario());

        // Execução Vendedor
        vendedor.apresentarDados();
        vendedor.registrarVenda();
        System.out.printf("Salário Final: R$ %.2f%n", vendedor.calcularSalario());

        // Execução Estagiário
        estagiario.apresentarDados();
        System.out.println("Instituição de Ensino: " + estagiario.getInstituicaoEnsino());
        estagiario.realizarTreinamento();
        System.out.printf("Salário Final (Bolsa): R$ %.2f%n", estagiario.calcularSalario());
    }
}