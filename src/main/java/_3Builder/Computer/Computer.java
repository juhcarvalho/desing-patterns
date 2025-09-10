package _3Builder.Computer;

public class Computer {
    private String cpu;
    private String gpu;
    private String ram;
    private String ssd;
    private String motherboard;
    private String cooler;

    @Override
    public String toString(){
        return "Computer { \n" +
                    formatToPrint("cpu", cpu) +
                    formatToPrint("gpu", gpu) +
                    formatToPrint("ram", ram) +
                    formatToPrint("ssd", ssd) +
                    formatToPrint("motherboard", motherboard) +
                    formatToPrint("cooler", cooler) +
                "}";
    }

    private String formatToPrint (String component, String value) {
        return (value != null && !value.isEmpty()) ? String.format("   %s: '%s',\n", component, value) : "";
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public void setMotherboard(String placaMae) {
        this.motherboard = placaMae;
    }

    public void setCooler(String cooler) {
        this.cooler = cooler;
    }
}
