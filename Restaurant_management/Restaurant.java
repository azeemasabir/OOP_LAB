package Restaurant_management;

public class Restaurant {
    private String name;
    private MenuItem[] menu;

    public Restaurant(String name) {
        this.name = name;
       this.menu = new MenuItem[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuItem[] getMenu() {
        return menu;
    }

    public void setMenu(MenuItem[] menu) {
        this.menu = menu;
    }
    public void addMenuItem(MenuItem item){
        MenuItem [] newMenu = new MenuItem[menu.length+1];
        System.arraycopy(menu,0,newMenu,0,menu.length);
        newMenu[menu.length] = item;
        menu = newMenu;
    }
}
