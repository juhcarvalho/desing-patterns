package _2FactoryMethod.DocumentosDigitais;

public class Recibo implements Documento {

    @Override
    public void assinar() {
        System.out.println("Recibo assinado");
    }
}
