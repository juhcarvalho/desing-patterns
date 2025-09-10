package _2FactoryMethod.MeioPagamento;

public class CartaoCredito implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado no cartão de crédito");
    }
}
