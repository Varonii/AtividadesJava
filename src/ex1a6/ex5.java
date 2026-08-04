package ex1a6;

public class ex5 {
    public static void main(String[] args) {

        String dados = mostrarConsumo("João", 100);
        System.out.println(dados);
        System.out.println("Valor: " + calcularValorConta(100));
        System.out.println("Classificação: " + classificarConsumo(100));
    }
    public static String mostrarConsumo(String nome, int consumo){
        return "Nome: " + nome + "\n" + "Consumo: " + consumo + "m³";
    }
    public static double calcularValorConta(int consumo){
        return consumo * 4.50;
    }
    public static String classificarConsumo(int consumo){
        if (consumo <= 10){
            return "Baixo";
        } else if (consumo <= 20){
            return "Médio";
        } else {
            return "Alto";
        }
    }
}
