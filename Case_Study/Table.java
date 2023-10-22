package Case_Study;

public class Table extends Furniture {
    String shape;
    String material;
    String dimensions;

    public Table(String name, double price, int stockQuantity, double tax, String material, String dimensions, String shape, String material1, String dimensions1) {
        super(name, price, stockQuantity, tax, material, dimensions);
        this.shape = shape;
        this.material = material1;
        this.dimensions = dimensions1;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
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

    @Override
    public String toString() {
        return "Table{" +
                "shape='" + shape + '\'' +
                ", material='" + material + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", material='" + material + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                '}';
    }
}
