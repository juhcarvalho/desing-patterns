package _2FactoryMethod.MeioPagamento;

public class Boleto implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado no boleto");
    }
}
