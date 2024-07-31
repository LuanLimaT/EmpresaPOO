import java.util.Date;

public class Parcela {
    private Date dataVenc;
    private double valor;

    public Parcela(Date dataVenc, double valor) {
        this.dataVenc = dataVenc;
        this.valor = valor;
    }

    public Date getDataVenc() {
        return dataVenc;
    }

    public double getValor() {
        return valor;
    }
}
