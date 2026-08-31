package AT12;
import java.util.Locale;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String palavra = sc.nextLine();
        int tamanho = palavra.length();

        System.out.println("A palavra digitada é: " + palavra);
        System.out.println("Quantidade de caracteres é: " + palavra.length());
        System.out.println("Letras em maiúsculas: " + palavra.toUpperCase());
        System.out.println("Letras em minúsculas: " + palavra.toLowerCase());
        System.out.println("Primeiro caracter: " + palavra.charAt(0));
        System.out.println("Último caracter: " + palavra.charAt(palavra.length() -1));
    }
}
