package Marcelo.B4.AT13;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", 500.00);
        String[] tentativasSaque = {"100", "600", "-50", "abc"};

        for (String entrada : tentativasSaque) {
            System.out.println("Tentativa de saque: " + entrada);
            try {
                double valor = Double.parseDouble(entrada);
                conta.sacar(valor);
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } catch (NumberFormatException e) {
                System.out.println("Erro: A entrada '" + entrada + "' não é um número válido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de validação: " + e.getMessage());
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro de saldo: " + e.getMessage());
            } finally {
                System.out.printf("Saldo atual: R$ %.2f%n%n", conta.getSaldo());
            }
        }

        conta.exibirDados();
    }
}