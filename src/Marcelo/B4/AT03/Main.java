package Marcelo.B4.AT03;

public class Main {
    public static void main(String[] args) {
        Personagem Mago = new Mago("Jonatas", 87);
        Personagem Guerreiro = new Guerreiro("Carlos", 67);

        Mago.exibirEstatos();
        Mago.atacar();

        Guerreiro.exibirEstatos();
        Guerreiro.atacar();
    }
}