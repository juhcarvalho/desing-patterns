package _2FactoryMethod.DocumentosDigitais;

public class DocumentoFactory {

    public static Documento prepararDocumento(TipoDocumento tipo) {
        return switch (tipo) {
            case CONTRATO -> new Contrato();
            case RECIBO -> new Recibo();
            case NOTA_FISCAL -> new NotaFiscal();
            default -> throw new IllegalArgumentException("Tipo inválido");
        };
    }
}
