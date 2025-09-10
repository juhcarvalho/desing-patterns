package _2FactoryMethod.VeiculosEletricos;

public class VeiculoFactory {
    public static VeiculoEletrico carregarVeiculo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "carro":
                return new CarroEletrico();
            case "moto":
                return new MotoEletrica();
            case "patinete":
                return new PatineteEletrico();
            default:
                throw new IllegalArgumentException("Tipo Inválido");
        }
    }
}
