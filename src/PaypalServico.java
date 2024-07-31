public class PaypalServico implements OnlineServicePgto {
    private static final double TAXA_PGTO = 0.02;
    private static final double JUROS = 0.01;

    @Override
    public double taxaPgto(double valor) {
        return valor * TAXA_PGTO;
    }

    @Override
    public double juros(double valor, int meses) {
        return valor * JUROS * meses;
    }
}
