package Case_Study;

import java.util.Arrays;

public class InventoryManagement {
    int size;
    Product [] products;

    public InventoryManagement(int capacity) {

        products = new Product[capacity];
        size = 0;
    }

    // method to add a product
    public void addProduct(Product product){
        if(products.length>size){
            products[size]=product;
            size++;
        }
        else{
            System.out.println("no more products can be added");
        }
    }
    // method to display the products
    public void display() {
        System.out.println("Contents in the inventory are:");
        for (int i = 0; i < size; i++) {
            if (products[i] != null) {
                System.out.println(products[i].toString());
            }
        }
    }
    // method to remove the product from the list
    public void removeProduct(Product productToRemove) {
        for (int i = 0; i < size; i++) {
            if (products[i] != null && products[i].equals(productToRemove)) {
                for (int j = i; j < size - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[size - 1] = null;
                size--;
                System.out.println("Product removed: " + productToRemove.getName());
                return;
            }
        }
        System.out.println("Product not found in the inventory.");
    }

    // to search a product present in the list by entering the name of product
    public Product searchProductByName(String productName) {
        for (int i = 0; i < size; i++) {
            if (products[i] != null && products[i].getName().equals(productName)) {
                return products[i]; // Product found
            }
        }
        return null; // Product not found
    }

    //to search a product present in the list by entering the index of product
    public Product getProductByIndex(int index) {
        if (index >= 0 && index < size) {
            return products[index];
        } else {
            return null; // Index is out of bounds
        }
    }

    public void updateProductPrice(Product product, double newPrice){
        for(int i = 0; i<size-1; i++){
            if (products[i]!= null && products[i].equals(product)){
                products[i].price = newPrice;
                System.out.println("Price updated for: " + product.getName());
                return;
            }
        }
    }
}
