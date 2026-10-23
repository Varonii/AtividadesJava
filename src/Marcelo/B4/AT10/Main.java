package Marcelo.B4.AT10;

public class Main {
    public static void main(String[] args) {
        EntregaBicicleta entregaBike = new EntregaBicicleta("BIKE-101", 5.0);
        EntregaCaminhao entregaCaminhao = new EntregaCaminhao("CAM-202", 20.0);

        System.out.println("--- ENTREGA 1 ---");
        entregaBike.exibirDados();
        entregaBike.rastrear();

        System.out.println();

        System.out.println("--- ENTREGA 2 ---");
        entregaCaminhao.exibirDados();
        entregaCaminhao.rastrear();
    }
}