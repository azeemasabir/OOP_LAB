package Case_Study;

public class Seating extends Furniture {
    String material;
    String dimensions;
    int load;

    public Seating(String name, double price, int stockQuantity, double tax, String material, String dimensions, String material1, String dimensions1, int load) {
        super(name, price, stockQuantity, tax, material, dimensions);
        this.material = material1;
        this.dimensions = dimensions1;
        this.load = load;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getDimensions() {
        return dimensions;
    }

    @Override
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Seating{" +
                "material='" + material + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", load=" + load +
                ", material='" + material + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                '}';
    }
}
