package _2FactoryMethod.MeioPagamento;

public class BoletoFactory extends PagamentoFactory {

    @Override
    public Pagamento criarPagamento() {
        return new Boleto();
    }
}
