public abstract class Motorista {

    private String nome;
    private String placaVeiculo;
    private int quantidadeCorridas;
    private double valorTotalBruto;

    public Motorista(String nome, String placaVeiculo) {
        this.nome = nome;
        this.placaVeiculo = placaVeiculo;
        this.quantidadeCorridas = 0;
        this.valorTotalBruto = 0.0;
    }

    public void registrarCorrida(double valor) {
        this.quantidadeCorridas++;
        this.valorTotalBruto += valor;
    }

    public abstract double calcularPagamentoLiquido();

    public String getNome() {
        return nome;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public int getQuantidadeCorridas() {
        return quantidadeCorridas;
    }

    public double getValorTotalBruto() {
        return valorTotalBruto;
    }

    public void imprimirHolerite() {
        System.out.println("========================================");
        System.out.println(" HOLERITE / EXTRATO DO MOTORISTA");
        System.out.println("========================================");
        System.out.println("Nome: " + getNome());
        System.out.println("Placa: " + getPlacaVeiculo());
        System.out.println("Quantidade de corridas: " + getQuantidadeCorridas());
        System.out.printf("Valor bruto arrecadado: R$ %.2f%n", getValorTotalBruto());
        System.out.printf("Valor líquido a receber: R$ %.2f%n", calcularPagamentoLiquido());
        System.out.println("========================================");
        System.out.println();
    }
}
