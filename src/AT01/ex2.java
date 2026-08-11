package AT01;

public class ex2 {
    public static void main(String[] args) {
        double vf = calcularDesconto(100.00, 5.0);
        System.out.println("Preço original: " + 100.00);
        System.out.println("Desconto: 5%");
        System.out.println("Valor final: " + vf);
    }

    public static double calcularDesconto(double preco, double desconto){
        return preco - (preco * (desconto / 100.00));
    }
}
