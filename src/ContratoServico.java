import java.util.Calendar;

public class ContratoServico {
    private OnlineServicePgto servicoPgto;

    public ContratoServico(OnlineServicePgto servicoPgto) {
        this.servicoPgto = servicoPgto;
    }

    public void processarContrato(Contrato contrato, int meses) {
        double valorParcela = contrato.getValorTotal() / meses;
        Calendar cal = Calendar.getInstance();
        cal.setTime(contrato.getData());

        for (int i = 1; i <= meses; i++) {
            cal.add(Calendar.MONTH, 1);
            double valorComJuros = valorParcela + servicoPgto.juros(valorParcela, i);
            double valorFinal = valorComJuros + servicoPgto.taxaPgto(valorComJuros);
            contrato.adicionarParcela(new Parcela(cal.getTime(), valorFinal));
        }
    }
}
