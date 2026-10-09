public class MotoristaParceiroFrotista extends Motorista {

    private static final double PERCENTUAL_RETIDO_PLATAFORMA = 0.20;
    private static final double ALUGUEL_VEICULO = 800.0;

    public MotoristaParceiroFrotista(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double valorLiquido = getValorTotalBruto() * (1 - PERCENTUAL_RETIDO_PLATAFORMA);
        valorLiquido -= ALUGUEL_VEICULO;

        if (valorLiquido < 0) {
            return 0.0;
        }

        return valorLiquido;
    }
}
