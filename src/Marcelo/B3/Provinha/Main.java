package Marcelo.B3.Provinha;
// Classe de execução do programa
public class Main {
    public static void main(String[] args) {

        // 3. OBJETO: Instanciação concreta da classe Carro na memória
        Carro meuCarro = new Carro("Toyota", 4);
        Carro outroCarro = new Carro("Honda", 2);

        // Chamando MÉTODOS e demonstrando POLIMORFISMO
        meuCarro.emitirSom();         // Executa a sobrescrita (@Override) da classe Carro
        meuCarro.acelerar();          // Executa a versão 1 do método acelerar()
        meuCarro.acelerar(35.5);      // Executa a versão 2 (Sobrecarga com argumento double)

        // Uso de MÉTODOS ACESSORES (Getters e Setters)
        meuCarro.setMarca("Toyota Corolla");
        System.out.println("Marca alterada via Setter: " + meuCarro.getMarca());

        // Acessando membro com quantificador STATIC (pertence à classe, não ao objeto)
        System.out.println("Total de veículos criados na memória: " + Veiculo.totalVeiculos);

        // Acessando membro com quantificador FINAL (constante)
        System.out.println("Tipo do veículo: " + meuCarro.TIPO);
    }
}