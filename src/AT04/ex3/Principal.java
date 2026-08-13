package AT04.ex3;

public class Principal {

    public static void main(String[] args) {
            Veiculo v1 = new Veiculo("Corolla", "Toyota", 60);
            v1.mostrarDados();
            v1.acelerar(50);
            v1.mostrarDados();
            v1.frear(20);
            v1.mostrarDados();
        }
}