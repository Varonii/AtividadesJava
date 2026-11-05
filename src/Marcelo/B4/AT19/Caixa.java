package Marcelo.B4.AT19;

public class Caixa<T> {
    private T conteudo;

    public void guardar(T conteudo) {
        this.conteudo = conteudo;
    }

    public T obter() {
        return conteudo;
    }
}