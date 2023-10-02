package lab_assignment;

public class Computer {
   private String computerNumber;
    private String icdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;

    public Computer(String computerNumber, String icdModel, int ramSize, int hddSize, boolean hasGPU) {
        this.computerNumber = computerNumber;
        this.icdModel = icdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }


    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getIcdModel() {
        return icdModel;
    }

    public void setIcdModel(String icdModel) {
        this.icdModel = icdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }
    public Computer clone(){
        return new Computer(this.computerNumber,this.icdModel,this.ramSize,this.hddSize,this.hasGPU);
    }

}
