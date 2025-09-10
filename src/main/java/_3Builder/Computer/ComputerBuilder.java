package _3Builder.Computer;

public class ComputerBuilder {
    private Computer computer;

    public ComputerBuilder(){
        computer = new Computer();
    }

    public ComputerBuilder cpu(String cpuModel) {
        computer.setCpu(cpuModel);
        return this;
    }

    public ComputerBuilder gpu(String gpuModel) {
        computer.setGpu(gpuModel);
        return this;
    }

    public ComputerBuilder ram(String ramModel) {
        computer.setRam(ramModel);
        return this;
    }

    public ComputerBuilder ssd(String ssdModel) {
        computer.setSsd(ssdModel);
        return this;
    }

    public ComputerBuilder cooler(String coolerModel) {
        computer.setCooler(coolerModel);
        return this;
    }

    public ComputerBuilder motherboard(String motherboardModel) {
        computer.setMotherboard(motherboardModel);
        return this;
    }

    public Computer build() {
        return computer;
    }
}
