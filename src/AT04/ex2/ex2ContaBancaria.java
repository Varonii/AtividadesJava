package AT04.ex2;

public class ex2ContaBancaria {
    // Atributos
    String titular;
    String numeroConta;
    double saldo;

    // Construtor
    public ex2ContaBancaria(String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro (verifica se há saldo suficiente)
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saque de R$ " + valor + " recusado: Saldo insuficiente!");
        }
    }

    // Método para exibir o saldo atual
    public void mostrarSaldo() {
        System.out.println("----------------------------------------");
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo Atual: R$ " + saldo);
        System.out.println("----------------------------------------");
    }
}