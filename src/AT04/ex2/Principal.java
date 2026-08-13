package AT04.ex2;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria Silva", "12345-6", 500.00);

        conta.mostrarSaldo();

        conta.depositar(200.00);
        conta.mostrarSaldo();

        conta.sacar(300.00);
        conta.mostrarSaldo();

        conta.sacar(600.00);
        conta.mostrarSaldo();
    }
}