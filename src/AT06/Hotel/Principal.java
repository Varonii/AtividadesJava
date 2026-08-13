package AT06.Hotel;

public class Principal {
    public static void main(String[] args) {
        ReservaHotel reserva1 = new ReservaHotel("João Pedro", 25, 5, 79.99);
        ReservaHotel reserva2 = new ReservaHotel("Anna Leticia", 14, 8, 79.99);
        ReservaHotel reserva3 = new ReservaHotel("Carlos Abreu", 2, 3, 79.99);

        System.out.println(reserva1);
        System.out.println(reserva2);
        System.out.println(reserva3);

        double valorNormal = reserva1.calcularHospedagem();
        System.out.printf("Valor final (Reserva 1): R$ %.2f%n", valorNormal);

        double valorComDesconto = reserva2.calcularHospedagem(10.0);
        System.out.printf("Valor final com desconto (Reserva 2): R$ %.2f%n", valorComDesconto);

        double valorComTaxa = reserva3.calcularHospedagem(10.0, 20.0);
        System.out.printf("Valor final com desconto e taxa (Reserva 3): R$ %.2f%n", valorComTaxa);

    }

}
