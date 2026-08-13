package AT03;

public class MaiorMenor {
    static void main() {
        int[] n = new int[8];

        n[0] = 43;
        n[1] = 65;
        n[2] = 83;
        n[3] = 15;
        n[4] = 35;
        n[5] = 63;
        n[6] = 27;
        n[7] = 95;

        int maiorNumero = n[0];
        int menorNumero = n[0];

        for(int i = 0; i < n.length; i++){
            if (n[i] > maiorNumero){
                maiorNumero = n[i];
            }
            if (n[i] < menorNumero){
                menorNumero = n[i];
            }
        }
        System.out.println("Maior numero: " + maiorNumero);
        System.out.println("Menor numero: " + menorNumero);
    }
}
