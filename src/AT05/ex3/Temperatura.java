package AT05.ex3;

public class Temperatura {
    private String nomeCidade;
    private double temperaturaAtual;
    private String unidadeMedida;

    public Temperatura(String nomeCidade, double temperaturaAtual, String unidadeMedida) {
        this.nomeCidade = nomeCidade;
        this.temperaturaAtual = temperaturaAtual;
        this.unidadeMedida = unidadeMedida;
    }

    public void aumentarTemperatura(double valor) {
        if (valor > 0) {
            this.temperaturaAtual += valor;
            System.out.println("Temperatura aumentada em " + valor + "°" + unidadeMedida);
        } else {
            System.out.println("Erro: O valor informado deve ser positivo.");
        }
    }

    public void diminuirTemperatura(double valor) {
        if (valor > 0) {
            this.temperaturaAtual -= valor;
            System.out.println("Temperatura diminuída em " + valor + "°" + unidadeMedida);
        } else {
            System.out.println("Erro: O valor informado deve ser positivo.");
        }
    }

    public void mostrarDados() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cidade: " + nomeCidade +
                " | Temperatura: " + String.format("%.1f", temperaturaAtual) + " °" + unidadeMedida;
    }
}