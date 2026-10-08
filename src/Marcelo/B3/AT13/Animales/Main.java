package Marcelo.B3.AT13.Animales;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Gatinho", "Miau");
        Cachorro cachorro = new Cachorro("Cachorrinho", "Au Au");

        cachorro.apresentarDados();
        gato.apresentarDados();
    }
}
