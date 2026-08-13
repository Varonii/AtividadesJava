package AT06.Hotel;

public class ReservaHotel {
    private String nomeHospede;
    private int numeroQuarto;
    private int quantidadeDiarias;
    private double valorDiaria;

    public String getNomeHospede(){
        return this.nomeHospede;
    }
    public void setNomeHospede(String nomeHospede){
        if (nomeHospede != null && !nomeHospede.trim().isEmpty()) {
            this.nomeHospede = nomeHospede;
        } else {
            System.out.println("Nome inválido, por favor cadastre o nome corretamente.");
        }
    }

    public int getNumeroQuarto(){
        return this.numeroQuarto;
    }
    public void setNumeroQuarto(int numeroQuarto){
        if (numeroQuarto > 0){
            this.numeroQuarto = numeroQuarto;
        } else {
            System.out.println("Numero de quarto inválido, por favor cadastre um quarto existente.");
        }
    }

    public int getQuantidadeDiarias(){
        return this.quantidadeDiarias;
    }
    public void setQuantidadeDiarias(int quantidadeDiarias){
        if (quantidadeDiarias > 0){
            this.quantidadeDiarias = quantidadeDiarias;
        } else {
            System.out.println("Numero de diárias inválido, por favor cadastre a quantidade de dias positivos.");
        }
    }

    public double getValorDiaria(){
        return this.valorDiaria;
    }
    public void setValorDiaria(double valorDiaria){
        if (valorDiaria > 0){
            this.valorDiaria = valorDiaria;
        } else {
            System.out.println("Valor da diária inválido, por favor cadastre um valor positivo.");
        }
    }

    public ReservaHotel(String nomeHospede, int numeroQuarto, int quantidadeDiarias, double valorDiaria){
        setNomeHospede(nomeHospede);
        setNumeroQuarto(numeroQuarto);
        setQuantidadeDiarias(quantidadeDiarias);
        setValorDiaria(valorDiaria);
    }

    @Override
    public String toString(){
        return "Reserva: " + this.nomeHospede + "\n" +
                "Quarto: " + this.numeroQuarto + "\n" +
                "Diárias: " + this.quantidadeDiarias + "\n" +
                "Valor diária: R$" + this.valorDiaria + "\n";
    }

    public double calcularHospedagem(){
        return this.valorDiaria * this.quantidadeDiarias;
    }
    public double calcularHospedagem(double percentualDesconto){
        if (percentualDesconto < 0 || percentualDesconto > 100){
            System.out.println("Valor de desconto inválido.");
            return calcularHospedagem();
        } else {
            double valorSemDesconto = calcularHospedagem();
            return valorSemDesconto * (1-(percentualDesconto/100));
        }
    }
    public double calcularHospedagem(double percentualDesconto, double taxaServico){
        if (taxaServico < 0){
            System.out.println("Valor de taxa inválido.");
            return calcularHospedagem();
        } else {
            double valorComDesconto = calcularHospedagem(percentualDesconto);
            return valorComDesconto + taxaServico;
        }
    }
}
