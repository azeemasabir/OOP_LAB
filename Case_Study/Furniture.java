package Case_Study;

public class Furniture extends Product{
    String material;
    String dimensions;

    public Furniture(String name, double price, int stockQuantity, double tax, String material, String dimensions) {
        super(name, price, stockQuantity, tax);
        this.material = material;
        this.dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }



    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                '}';
    }
}
