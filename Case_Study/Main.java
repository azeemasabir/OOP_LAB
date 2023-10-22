package Case_Study;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            InventoryManagement IM1 = new InventoryManagement(100);
            Product P1 = new Product("Iphone11",999.0,50,200.00);
            Groceries G1 = new Groceries("Bread",100,5,10,new Date(12,6,2024));
            Electronics E1 = new Electronics("Microwave",1000.00,40,100,"220 watts","3 years");
            Furniture F1 = new Furniture("Bed",499.99,30,20,"Wooden","2 by 1.5 meter");
            Laptop L1 = new Laptop("lenovo",50000,30,10000,"350 watt","2 years","6GB","16 by 9 inches","i5");
            Phone Ph1 = new Phone("Samsung S11",699.99,68,150.99,"20 watt","4 Years","Android");
            Seating S1 = new Seating("Bed",499.99,30,20,"Wooden","2 by 1.5 meter","Glass","5 by 2 inches",2);
            Table T1 = new Table("Table",499.99,30,20,"Wooden","2 by 1.5 meter","Round corners","glass and wooden","4 by 2 meters");
        IM1.addProduct(P1);
        IM1.addProduct(G1);
        IM1.addProduct(Ph1);
        IM1.addProduct(E1);
        IM1.addProduct(F1);
        IM1.addProduct(L1);
        IM1.addProduct(S1);
        IM1.addProduct(T1);
        IM1.display();
        System.out.println("Contents after removing some products from the inventory");
        IM1.removeProduct(P1);
        IM1.removeProduct(L1);
        IM1.display();
        System.out.println("checking stock status for "+G1.getName());
        G1.checkStockStatus();
        System.out.println("checking stock status for "+E1.getName());
        E1.checkStockStatus();

        int indexToSearch;
        System.out.println("Enter the index no to search your product:");
        indexToSearch = sc.nextInt();
        Product findProduct = IM1.getProductByIndex(indexToSearch);

        if (findProduct != null) {
            System.out.println("Found product at index " + indexToSearch + ": " + findProduct.getName() + " with price: " + findProduct.getPrice());
        } else {
            System.out.println("Index out of bounds. Product not found.");
        }
        String searchProductName;
        System.out.println("Enter the product name");
        searchProductName = sc.next();
        Product foundProduct = IM1.searchProductByName(searchProductName);

        if (foundProduct != null) {
            System.out.println("Found product: " + foundProduct.getName() + " with price: " + foundProduct.getPrice());
        } else {
            System.out.println("Product not found in the cart.");
        }
        IM1.updateProductPrice(Ph1,980.0);
        IM1.display();
    }
}
