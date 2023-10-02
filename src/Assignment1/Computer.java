package Assignment1;

public class Computer {
    String computerNumber;
    String icdModel;
    int ramSize;
    int hddSize;
    boolean hasGPU;

    public Computer() {

        this.computerNumber = "";
        this.icdModel = "";
        this.ramSize = 0;
        this.hddSize = 0;
        this.hasGPU = false;
    }


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
    public boolean equals(Object o){
        Computer c1=(Computer)o;
        if(this.computerNumber== c1.computerNumber){
            return true;

        }
        return false;

    }
    public Computer clone(){
       return new Computer(this.getComputerNumber(),this.getIcdModel(),this.getRamSize(),this.getHddSize(),this.isHasGPU());

   }

    @Override
    public String toString() {
        return "Computer{" +
                "computerNumber='" + computerNumber + '\'' +
                ", icdModel='" + icdModel + '\'' +
                ", ramSize=" + ramSize +
                ", hddSize=" + hddSize +
                ", hasGPU=" + hasGPU +
                '}';
    }
}

