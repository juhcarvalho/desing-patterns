package _2FactoryMethod.VeiculosEletricos;

public class MotoEletrica implements VeiculoEletrico {

    @Override
    public void carregar() {
        System.out.println("Carregar moto elétrica");
    }
}
