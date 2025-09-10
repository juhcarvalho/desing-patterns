package _2FactoryMethod;

import _2FactoryMethod.DocumentosDigitais.Documento;
import _2FactoryMethod.DocumentosDigitais.DocumentoFactory;
import _2FactoryMethod.DocumentosDigitais.TipoDocumento;
import _2FactoryMethod.MeioPagamento.*;
import _2FactoryMethod.VeiculosEletricos.VeiculoEletrico;
import _2FactoryMethod.VeiculosEletricos.VeiculoFactory;

public class AppFactoryMethod {
    public static void main(String[] args) {

        //appVeiculoEletrico();

        //appMeioPagamento();

        appAssinaturaDocumento();

    }

    /* Rodar o Sistema de Veiculo Eletrico */
    public static void appVeiculoEletrico() {
        VeiculoEletrico carro = VeiculoFactory.carregarVeiculo("carro");
        carro.carregar();

        VeiculoEletrico moto = VeiculoFactory.carregarVeiculo("moto");
        moto.carregar();

        VeiculoEletrico patinete = VeiculoFactory.carregarVeiculo("patinete");
        patinete.carregar();

        VeiculoEletrico onibus = VeiculoFactory.carregarVeiculo("ônibus");
        onibus.carregar();
    }

    public static void appMeioPagamento() {
        System.out.println(" ---- Bem vindo ao sistema de Pagamento ----");
        PagamentoFactory caixa1 = new CartaoCreditoFactory();
        Pagamento pagamento = caixa1.criarPagamento();
        pagamento.realizarPagamento(100);

        PagamentoFactory caixa2 = new CartaoDebitoFactory();
        Pagamento pagamento2 = caixa2.criarPagamento();
        pagamento2.realizarPagamento(150);

        PagamentoFactory caixa3 = new BoletoFactory();
        pagamento = caixa3.criarPagamento();
        pagamento.realizarPagamento(50);
    }

    public static void appAssinaturaDocumento() {

        Documento documento = DocumentoFactory.prepararDocumento(TipoDocumento.RECIBO);
        documento.assinar();

        documento = DocumentoFactory.prepararDocumento(TipoDocumento.CONTRATO);
        documento.assinar();

        documento = DocumentoFactory.prepararDocumento(TipoDocumento.NOTA_FISCAL);
        documento.assinar();

    }
}
