package Marcelo.B4.AT02;

public class Main {
    public static void main(String[] args) {
        Entrega local = new EntregaLocal("PED-001");
        Entrega nacional = new EntregaNacional("PED-002", 150.0);

        local.exibirResumo();
        nacional.exibirResumo();
    }
}