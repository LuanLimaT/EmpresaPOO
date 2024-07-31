import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        Date data = sdf.parse(sc.next());
        System.out.print("Valor do contrato: ");
        double valorTotal = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = sc.nextInt();

        Contrato contrato = new Contrato(numero, data, valorTotal);
        ContratoServico contratoServico = new ContratoServico(new PaypalServico());
        contratoServico.processarContrato(contrato, parcelas);

        System.out.println("Parcelas:");
        for (Parcela parcela : contrato.getParcelas()) {
            System.out.println(sdf.format(parcela.getDataVenc()) + " - " + String.format("%.2f", parcela.getValor()));
        }

        sc.close();
    }
}
