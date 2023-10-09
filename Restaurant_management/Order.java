package Restaurant_management;

public class Order {
    private MenuItem[] items;

    public Order() {
        items = new MenuItem[0];
    }

    public MenuItem[] getItems() {
        return items;
    }
    public void addItem(MenuItem item){
        MenuItem[] newItems = new MenuItem[items.length+1];
        System.arraycopy(items, 0, newItems, 0, items.length);
        newItems[items.length] = item;
        items = newItems;
    }
    public void removeItem(MenuItem item){
        MenuItem[] newItems = new MenuItem[items.length-1];
        int counter = 0;
        for(MenuItem currentItem : items){
            if(currentItem != item){
                newItems[counter++] = currentItem;
            }
        }
    items = newItems;
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
