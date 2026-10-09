public class MotoristaIniciante extends Motorista {

    private static final double PERCENTUAL_RETIDO_PLATAFORMA = 0.25;
    private static final int MINIMO_CORRIDAS_SEM_TAXA = 5;
    private static final double TAXA_INATIVIDADE = 50.0;

    public MotoristaIniciante(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double valorLiquido = getValorTotalBruto() * (1 - PERCENTUAL_RETIDO_PLATAFORMA);

        if (getQuantidadeCorridas() < MINIMO_CORRIDAS_SEM_TAXA) {
            valorLiquido -= TAXA_INATIVIDADE;
        }

        return valorLiquido;
    }
}
