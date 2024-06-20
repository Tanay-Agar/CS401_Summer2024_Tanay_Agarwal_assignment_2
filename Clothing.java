/**
 * Class: Clothing
 *
 * <p>
 * Implements a simple clothing item class. It is the child class of Product.
 * </p>
 *
 * @author Tanay Agarwal
 * @version Version Number 1.0
 * @since June, 18th, 2024
 */

package ecommerce.com; //Package

public class Clothing extends Product {
    private String size; //private string variable size
    private String color; //private string variable color

    public Clothing(String name, int id, double price, String size, String color) { //constructor
        super(name, id, price);
        this.size = size;
        this.color = color;
        this.category = "Clothing"; // Set protected category variable
    }

    public String getSize() { //gets size
        return this.size;
    }

    public void setSize(String size) { //sets size
        this.size = size;
    }

    public String getColor() { //gets color
        return this.color;
    }

    public void setColor(String color) { //sets color
        this.color = color;
    }

    @Override
    public String getProductDetails() { //overrides getProductDetails method
        return "Clothing{size='" + size + "', color='" + color + "', name='" + getName() + "', id=" + getId() + ", price=" + getPrice() + ", category='" + category + "'}";
    }
}