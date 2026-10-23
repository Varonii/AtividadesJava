package Marcelo.B4.AT11;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(100, "Onix", "ABC1D23", 4);
        Moto moto = new Moto(60, "CG 160", "XYZ9A87", 160);

        System.out.println("==== CARRO ====");
        carro.exibirDados();

        System.out.println("==== MOTO ====");
        moto.exibirDados();
    }
}
