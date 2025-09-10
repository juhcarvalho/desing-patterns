package _2FactoryMethod.MeioPagamento;

public class CartaoDebitoFactory extends PagamentoFactory {

    @Override
    public Pagamento criarPagamento() {
        return new CartaoDebito();
    }
}
