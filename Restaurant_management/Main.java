package Restaurant_management;
public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("CAFE BITES");

        MenuItem appetizer1 = new MenuItem("Spring Rolls", 5.99, MenuCategory.APPETIZERS);
        MenuItem mainCourse1 = new MenuItem("Chicken Alfredo", 12.99, MenuCategory.MAIN_COURSES);
        MenuItem dessert1 = new MenuItem("Chocolate Cake", 4.99, MenuCategory.DESSERTS);

        restaurant.addMenuItem(appetizer1);
        restaurant.addMenuItem(mainCourse1);
        restaurant.addMenuItem(dessert1);

        Order order = new Order();
        order.addItem(appetizer1);
        order.addItem(mainCourse1);
        order.addItem(dessert1);
        order.removeItem(mainCourse1);

        System.out.println("Restaurant Name: " + restaurant.getName());
        System.out.println("Menu Items:");
        for (MenuItem menuItem : restaurant.getMenu()) {
            System.out.println(menuItem);
        }
        System.out.println("\nYOUR ORDER IS:");
        for (MenuItem menuItem : order.getItems()) {
            System.out.println(menuItem);
        }
        double total = order.calculateTotal();
        System.out.println("Total: $" + total);
    }

}
