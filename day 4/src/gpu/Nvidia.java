package gpu;

import java.util.Date;

public class Nvidia extends Gpu {

    private int numberOfCoolers;
    private short memoryCapacity;
    private String model;

    public void setMemoryCapacity(short memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public void setNumberOfCoolers(int numberOfCoolers) {
        this.numberOfCoolers = numberOfCoolers;
    }

    public void setModel(String model) { this.model = model; }

    public int getNumberOfCoolers() {
        return numberOfCoolers;
    }

    public short getMemoryCapacity() {
        return memoryCapacity;
    }

    public String getModel() { return model; }
}
