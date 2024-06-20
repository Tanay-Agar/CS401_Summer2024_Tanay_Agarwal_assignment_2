/**
 * Class: Main
 *
 * <p>
 * Main program implements a very simple e-commerce app.
 * </p>
 *
 * @version Version Number 1.0
 * @since June 18th, 2024
 */

package ecommerce.com; //Package

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products; // List to hold products in the cart

    public ShoppingCart() { // Constructor
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) { // Method to add product to the cart
        products.add(product);
    }

    public void removeProduct(Product product) { // Method to remove product from the cart
        products.remove(product);
    }

    public List<Product> getProducts() { // Method to get all products in the cart
        return products;
    }

    public double getTotalPrice() { // Method to calculate total price of products in the cart
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public int getTotalQuantity() { // Method to get the total quantity of products in the cart
        return products.size();
    }

    public void showCartDetails() { // Method to show details of all products in the cart
        for (Product product : products) {
            System.out.println(product.getProductDetails());
        }
    }

    public void clearCart() { // Method to clear the cart
        products.clear();
    }
}