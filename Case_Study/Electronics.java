package Case_Study;

public class Electronics extends Product{
    String powerConsumption;
    String warranty;

    public Electronics(String name, double price, int stockQuantity, double tax, String powerConsumption, String warranty) {
        super(name, price, stockQuantity, tax);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", warranty='" + warranty + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                '}';
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }
}
