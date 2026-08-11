package AT02;

public class ex1 {
    public static void main(String[] args) {
        double soma = notas(60, 70, 80);
        double media = mediaNotas(soma);
        String situacao = situacaoFinal(media);

        System.out.println("Situação: " + situacao);
        System.out.println("--- Dados ---");
        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);
    }

    public static double notas(double nota1, double nota2, double nota3){
        return nota1 + nota2 + nota3;
    }

    public static double mediaNotas(double somaTotal){
        return somaTotal / 3;
    }

    public static String situacaoFinal(double situacao){
        if(situacao > 70){
            return "Aprovado!";
        }else{
            return "Reprovado";
        }
    }
}
