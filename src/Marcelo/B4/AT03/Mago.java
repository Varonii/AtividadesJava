package Marcelo.B4.AT03;

public class Mago  extends Personagem {

    public Mago(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " Lançar feitiço!");
    }
}