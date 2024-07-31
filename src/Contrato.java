import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private int numero;
    private Date data;
    private double valorTotal;
    private List<Parcela> parcelas;

    public Contrato(int numero, Date data, double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
        this.parcelas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public Date getData() {
        return data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void adicionarParcela(Parcela parcela) {
        this.parcelas.add(parcela);
    }
}
