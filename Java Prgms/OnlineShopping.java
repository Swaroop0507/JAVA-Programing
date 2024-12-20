import java.util.ArrayList;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart {
    private ArrayList<Product> cart = new ArrayList<>();

    public void addProduct(Product product) {
        cart.add(product);
        System.out.println("Added: " + product.name);
    }

    public void removeProduct(Product product) {
        if (cart.remove(product)) {
            System.out.println("Removed: " + product.name);
        } else {
            System.out.println("Product not found in the cart.");
        }
    }

    public void calculateTotal() {
        double total = 0;
        for (Product product : cart) {
            total += product.price;
        }
        System.out.println("Total Price: " + total);
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 1000);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.calculateTotal();
        cart.removeProduct(p1);
        cart.calculateTotal();
    }
}
