package _2FactoryMethod.MeioPagamento;

public class CartaoDebito implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado no Cartão de Débito");
    }
}
