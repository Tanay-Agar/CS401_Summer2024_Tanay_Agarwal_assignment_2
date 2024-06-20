/**
 * Class: Electronic
 *
 * <p>
 * Implements a very simple electronic device class. It is the child class of Product.
 * </p>
 *
 * @author Tanay Agarwal
 * @version Version Number 1.0
 * @since June, 18th, 2024
 */

package ecommerce.com; //Package

public class Electronic extends Product {
    private String brand; //private string variable brand
    private String model; //private string variable model

    public Electronic(String name, int id, double price, String brand, String model) { //constructor
        super(name, id, price);
        this.brand = brand;
        this.model = model;
        this.category = "Electronic"; // Set protected category variable
    }

    public String getBrand() { //gets brand
        return this.brand;
    }

    public void setBrand(String brand) { //sets brand
        this.brand = brand;
    }

    public String getModel() { //gets model
        return this.model;
    }

    public void setModel(String model) { //sets model
        this.model = model;
    }

    @Override
    public String getProductDetails() { //overrides getProductDetails method
        return "Electronic{brand='" + brand + "', model='" + model + "', name='" + getName() + "', id=" + getId() + ", price=" + getPrice() + ", category='" + category + "'}";
    }
}
