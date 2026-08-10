package ex1a6;

public class ex6 {
    public static void main(String[] args) {
        mostrarRelatório();
    }
    public static int calcularPontos(int v, int e, int d){
        return v * 3 + e;
    }
    public static double calcularAproveitamento(){
        return (calcularPontos(23, 10, 5) * 100) / 114;
    }
    public static String verificarSituacao(){
        String resultado = "";
        if (calcularAproveitamento() > 80){
            resultado = "Exelente";
        }
        if (calcularAproveitamento() > 60 && calcularAproveitamento() < 79){
            resultado = "Bom";
        }
        if (calcularAproveitamento() > 40 && calcularAproveitamento() < 59){
            resultado = "Ruim";
        }
        if (calcularAproveitamento() < 40){
            resultado = "Péssimo";
        }
        return resultado;
    }
    public static void mostrarRelatório(){
        System.out.println("Pontos: " + calcularPontos(23, 10, 5));
        System.out.println("Aproveitamento: " + calcularAproveitamento());
        System.out.println("Desempenho: " + verificarSituacao());
    }
}
