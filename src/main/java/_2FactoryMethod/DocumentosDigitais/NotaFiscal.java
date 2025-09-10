package _2FactoryMethod.DocumentosDigitais;

public class NotaFiscal implements Documento {

    @Override
    public void assinar() {
        System.out.println("Nota Fiscal assinada!");
    }
}
