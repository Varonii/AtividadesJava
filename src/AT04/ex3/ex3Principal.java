package AT04.ex3;

public class ex3Veiculo{

    public static void main(String[] args) {
            ex3Veiculo v1 = new ex3Veiculo("Corolla", "Toyota", 60);
            v1.mostrarDados();
            v1.acelerar(50);
            v1.mostrarDados();
            v1.frear(20);
            v1.mostrarDados();
        }
}