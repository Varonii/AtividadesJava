public class Teste {
    public static void main(String[] args) {
        System.out.println("Chegou base " + somarValores(5, 1));
    }

    public static int somarValores(int x, int cumulativo) {
        if (x <= 1) {
            System.out.println("1 = 1");
            return cumulativo * 1;
        }

        System.out.print(x + " = ");
        for (int i = x; i >= 1; i--) {
            if (i > 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();
        return somarValores(x - 1, cumulativo * x);
    }
}