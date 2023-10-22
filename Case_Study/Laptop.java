package Case_Study;

public class Laptop extends Electronics {
    String ram;
    String scDimension;
    String processor;

    public Laptop(String name, double price, int stockQuantity, double tax, String powerConsumption, String warranty, String ram, String scDimension, String processor) {
        super(name, price, stockQuantity, tax, powerConsumption, warranty);
        this.ram = ram;
        this.scDimension = scDimension;
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getScDimension() {
        return scDimension;
    }

    public void setScDimension(String scDimension) {
        this.scDimension = scDimension;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram='" + ram + '\'' +
                ", scDimension='" + scDimension + '\'' +
                ", processor='" + processor + '\'' +
                ", powerConsumption='" + powerConsumption + '\'' +
                ", warranty='" + warranty + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                '}';
    }
}

