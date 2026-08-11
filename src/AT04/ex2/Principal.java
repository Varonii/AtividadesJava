package AT04.ex2;

public class Principal {
    public static void main(String[] args) {
        // Criando uma conta para a Maria com saldo inicial de R$ 500.00
        ex2ContaBancaria conta = new ex2ContaBancaria("Maria Silva", "12345-6", 500.00);

        // Exibe o saldo inicial
        conta.mostrarSaldo();

        // Testando um depósito de R$ 200.00
        conta.depositar(200.00);
        conta.mostrarSaldo();

        // Testando um saque PERMITIDO (R$ 300.00)
        conta.sacar(300.00);
        conta.mostrarSaldo();

        // Testando um saque NEGADO (tentando sacar R$ 600.00 tendo apenas R$ 400.00)
        conta.sacar(600.00);
        conta.mostrarSaldo();
    }
}