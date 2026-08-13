package AT05.ex3;

public class Principal {
    public static void main(String[] args) {
        Temperatura cidade = new Temperatura("Curitiba", 18.5, "C");

        System.out.println("--- Dados Iniciais ---");
        System.out.println(cidade); // Chama o toString() com @Override

        System.out.println("\n--- Alterando Temperatura ---");
        cidade.aumentarTemperatura(5.5);

        cidade.diminuirTemperatura(3.0);

        cidade.diminuirTemperatura(-2.0);

        System.out.println("\n--- Dados Atualizados ---");
        cidade.mostrarDados();
    }
}