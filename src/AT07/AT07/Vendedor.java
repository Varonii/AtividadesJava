package AT07.AT07;

public class Vendedor extends Funcionario {
    private double valorVendas;
    private double percentualComissao;

    public Vendedor(String nome, int matricula, double salarioBase, double valorVendas, double percentualComissao) {
        super(nome, matricula, salarioBase);
        setValorVendas(valorVendas);
        setPercentualComissao(percentualComissao);
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        if (valorVendas < 0) {
            System.out.println("ERRO: O valor das vendas não pode ser negativo.");
        } else {
            this.valorVendas = valorVendas;
        }
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        if (percentualComissao >= 0 && percentualComissao <= 100) {
            this.percentualComissao = percentualComissao;
        } else {
            System.out.println("ERRO: O percentual de comissão deve estar entre 0 e 100.");
        }
    }

    public double calcularComissao() {
        return valorVendas * (percentualComissao / 100);
    }

    public void registrarVenda() {
        System.out.println("O vendedor " + getNome() + " registrou uma nova venda.");
    }

    @Override
    public void apresentarDados() {
        System.out.println("Cargo: Vendedor");
        super.apresentarDados();
        System.out.printf("Valor de vendas: R$ %.2f%n", valorVendas);
        System.out.printf("Percentual de comissão: %.2f%%%n", percentualComissao);
        System.out.printf("Valor da comissão: R$ %.2f%n", calcularComissao());
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + calcularComissao();
    }
}