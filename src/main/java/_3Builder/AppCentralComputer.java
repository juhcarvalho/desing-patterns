package _3Builder;

import _3Builder.Computer.Computer;
import _3Builder.Computer.ComputerBuilder;

public class AppCentralComputer {
    public static void main(String[] args) {

        ComputerBuilder cb = new ComputerBuilder();
        Computer c = cb
                .cpu("Intel i5")
                .ram("Memory RAM DDR5 8GB")
                .ssd("SSD Kingston NV3 1TB")
                .build();

        System.out.println(c);

    }
}
