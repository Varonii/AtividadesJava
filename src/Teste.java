public class Teste {
    public static void main(String[] args) {
        // Passamos 1 no cumulativo inicial para a multiplicação funcionar (elemento neutro)
        System.out.println("Chegou base " + somarValores(5, 1));
    }

    public static int somarValores(int x, int cumulativo) {
        // Caso base: quando chega em 1, apenas imprime "1 = 1" e retorna
        if (x <= 1) {
            System.out.println("1 = 1");
            return cumulativo * 1;
        }

        // Monta a impressão no formato exigido: "X = X * X-1 * ... * 1"
        System.out.print(x + " = ");
        for (int i = x; i >= 1; i--) {
            if (i > 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(); // Pula para a próxima linha

        // Chamada recursiva passando o X-1 e multiplicando o cumulativo
        return somarValores(x - 1, cumulativo * x);
    }
}