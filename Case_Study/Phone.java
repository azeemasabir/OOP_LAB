package Case_Study;

public class Phone extends Electronics{
    String os;
    String storage;
    String camera;

    public Phone(String name, double price, int stockQuantity, double tax, String powerConsumption, String warranty, String os) {
        super(name, price, stockQuantity, tax, powerConsumption, warranty);
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", storage='" + storage + '\'' +
                ", camera='" + camera + '\'' +
                ", powerConsumption='" + powerConsumption + '\'' +
                ", warranty='" + warranty + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                '}';
    }
}
