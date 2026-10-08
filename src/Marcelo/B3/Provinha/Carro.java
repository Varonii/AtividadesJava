package Marcelo.B3.Provinha;
// 1. ABSTRAÇÃO e CLASSE: 'Veiculo' é uma classe abstrata (molde genérico).
// Não pode ser instanciada diretamente com 'new Veiculo()'.
abstract class Veiculo {

    // MODIFICADORES DE ACESSO e ATRIBUTOS
    private String marca;          // private: acessível apenas dentro desta classe (Encapsulamento)
    protected double velocidade;    // protected: acessível por esta classe e por subclasses (filhas)

    // QUANTIFICADORES
    public static int totalVeiculos = 0; // static: pertence à CLASSE inteira, compartilhado por todos os objetos
    public final String TIPO = "Terrestre"; // final: constante, o valor não pode ser alterado após definido

    // Construtor: Executado ao criar o objeto
    public Veiculo(String marca) {
        this.marca = marca;
        this.velocidade = 0.0;
        Veiculo.totalVeiculos++; // Incrementa o atributo estático da CLASSE
    }

    // MÉTODOS ACESSORES (Getters e Setters)
    // Permitem ler e alterar atributos privados com controle e segurança
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.isEmpty()) { // Validação antes de alterar
            this.marca = marca;
        }
    }

    // MÉTODOS e POLIMORFISMO DE SOBRECARGA (Overload)
    // Métodos com o mesmo nome na mesma classe, mas com parâmetros diferentes
    public void acelerar() {
        this.velocidade += 10;
        System.out.println(marca + " acelerou para " + velocidade + " km/h.");
    }

    public void acelerar(double incremento) { // Sobrecarga do método acelerar
        this.velocidade += incremento;
        System.out.println(marca + " acelerou forte para " + velocidade + " km/h.");
    }

    // Método Abstrato: Não tem corpo aqui; obriga as classes filhas a implementarem
    public abstract void emitirSom();
}