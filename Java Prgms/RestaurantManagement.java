class Menu {
    String itemName;
    double price;

    public Menu(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }
}

class Order {
    Menu[] items;

    public Order(Menu[] items) {
        this.items = items;
    }

    public void calculateBill() {
        double total = 0;
        for (Menu item : items) {
            total += item.price;
        }
        System.out.println("Total Bill: " + total);
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Menu item1 = new Menu("Burger", 150);
        Menu item2 = new Menu("Fries", 50);

        Order order = new Order(new Menu[]{item1, item2});
        order.calculateBill();
    }
}
