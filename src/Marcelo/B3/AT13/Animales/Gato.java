package Marcelo.B3.AT13.Animales;

public class Gato extends Animais{
    public String som;

    public Gato(String nome, String som) {
        super(nome);
        this.som = som;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println(som);
    }
}
