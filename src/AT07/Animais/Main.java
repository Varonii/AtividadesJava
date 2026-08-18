package AT07.Animais;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Pimpolho", 4, 3.5, "Salsicha");
        Gato gato1 = new Gato("Pompom", 8, 2.4, "Cinza");
        Passaro passaro1 = new Passaro("Alfred", 2, 0.35, "Bem-Te-Vi");

        System.out.println("---------------------");
        cachorro1.apresentarDados();
        cachorro1.emitirSom();
        System.out.println("---------------------");
        gato1.apresentarDados();
        gato1.emitirSom();
        System.out.println("---------------------");
        passaro1.apresentarDados();
        passaro1.emitirSom();
        System.out.println("---------------------");
    }
}
