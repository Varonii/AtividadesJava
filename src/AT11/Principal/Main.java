package AT11.Principal;
import AT11.Contas.ContaPoupanca;
public class Main {
    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca(
                "Thiago",
                "389",
                7392.39,
                "C6 Bank",
                2.00
        );

        conta1.exibirDados();
        conta1.depositar(599);
        conta1.sacar(5928);
        conta1.aplicarRendimento();
        conta1.exibirDados();
    }
}
