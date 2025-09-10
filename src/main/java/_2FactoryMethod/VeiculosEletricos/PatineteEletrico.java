package _2FactoryMethod.VeiculosEletricos;

public class PatineteEletrico implements VeiculoEletrico {

    @Override
    public void carregar() {
        System.out.println("Carregar patinete elétrico");
    }
}
