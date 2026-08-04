package exVetores;

public class ex2vetores {
    public static void main(String[] args) {
        int[] n = new int[6];
        int soma = 0;
        n[0] = 1;
        n[1] = 7;
        n[2] = 5;
        n[3] = 3;
        n[4] = 7;
        n[5] = 15;

        for (int i = 0; i < n.length; i++){
            soma += n[i];
        }
        System.out.println("Soma: " + soma);
    }
}
