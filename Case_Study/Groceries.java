package Case_Study;

public class Groceries extends Product{
    private Date expiry;
    private int nutValue;

    public Groceries(String name, double price, int stockQuantity, double tax, Date expiry) {
        super(name, price, stockQuantity, tax);
        this.expiry = expiry;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public int getNutValue() {
        return nutValue;
    }

    public void setNutValue(int nutValue) {
        this.nutValue = nutValue;
    }

    @Override
    public String toString() {
        return "Groceries{" +
                "expiry=" + expiry +
                ", nutValue=" + nutValue +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                '}';
    }
}
