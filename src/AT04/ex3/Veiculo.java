package AT04.ex3;

public class Veiculo {
    String modelo;
    String marca;
    int velocidade;

    public Veiculo(String modelo, String marca, int velocidade) {
        this.modelo = modelo;
        this.marca = marca;
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        } else {
            this.velocidade = 0;
        }

    }

    public void acelerar(int valor) {
        if (valor > 0) {
            this.velocidade += valor;
            System.out.println("O veículo acelerou " + this.velocidade + "Km/h");
        } else {
            System.out.println("O valor para aceleração deve ser positivo");
        }

    }

    public void frear(int valor) {
        if (valor <= 0) {
            System.out.println("O valor para frear deve ser positivo");
        } else if (valor >= this.velocidade) {
            this.velocidade = 0;
        } else {
            this.velocidade -= valor;
            System.out.println("O veículo reduzio para " + this.velocidade + "Km/h");
        }

    }

    public void mostrarDados() {
        System.out.println("=== Dados do veículo ===");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade atual: " + this.velocidade + "Km/h");
        System.out.println();
    }
}
