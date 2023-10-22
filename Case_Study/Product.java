package Case_Study;

public class Product {
    String name;
    double price;
    int stockQuantity;
    double tax;

    public Product(String name, double price, int stockQuantity, double tax) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                '}';
    }
    public void checkStockStatus() {
        if (stockQuantity < 10) {
            System.out.println("Stock is low: Less than 10 products in the inventory.");
        } else {
            System.out.println("Stock is sufficient: 10 or more products in the inventory.");
        }
    }

}
