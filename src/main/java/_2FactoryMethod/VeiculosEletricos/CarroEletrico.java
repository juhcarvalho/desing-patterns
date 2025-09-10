package _2FactoryMethod.VeiculosEletricos;

public class CarroEletrico implements VeiculoEletrico {

    @Override
    public void carregar() {
        System.out.println("Carregar carro elétrico");
    }
}
