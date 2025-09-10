package _2FactoryMethod.DocumentosDigitais;

public class Contrato implements Documento {

    @Override
    public void assinar() {
        System.out.println("Contrato assinado!");
    }
}
