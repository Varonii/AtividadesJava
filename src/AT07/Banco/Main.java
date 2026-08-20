package AT07.Banco;

public class Main {
    public static void main(String[] args) {
        ContaPF contaPessoaFisica = new ContaPF("João",
                132,
                2014154.54,
                "42972305987"
        );

        ContaPJ contaPessoaJuridica = new ContaPJ("Jonatas Calheiros",
                842,
                320942.54,
                "09.574.963/0001-48"
        );

        System.out.println("----------------");
        contaPessoaFisica.depositar(324);
        contaPessoaFisica.sacar(2309);
        contaPessoaFisica.mostrarDados();

        System.out.println("----------------");
        contaPessoaJuridica.depositar(432);
        contaPessoaJuridica.sacar(23995);
        contaPessoaJuridica.mostrarDados();
    }
}
