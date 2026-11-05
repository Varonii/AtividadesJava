package Marcelo.B4.AT13;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O titular não pode ser nulo ou vazio.");
        }
        if (saldo < 0 || !Double.isFinite(saldo)) {
            throw new IllegalArgumentException("O saldo inicial deve ser um número finito não negativo.");
        }
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0 || !Double.isFinite(valor)) {
            throw new IllegalArgumentException("O valor do saque deve ser estritamente maior que zero e finito.");
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar a operação.");
        }
        this.saldo -= valor;
    }

    public void exibirDados() {
        System.out.printf("Titular: %s | Saldo final: R$ %.2f%n", titular, saldo);
    }
}