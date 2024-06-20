/**
 * Class: Product
 *
 * <p>
 * Product class is the parent class of all products.
 * </p>
 *
 * @version Version Number 1.0
 * @since June 18th, 2024
 */


package ecommerce.com; //Package

public abstract class Product { //Abstract class Product
    private String name; //private string variable name
    private int id; //private int variable id
    private double price; //private double variable price 
    protected String category; // Protected String category

    public Product(String name, int id, double price) { //constructor
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() { //gets name
        return this.name;
    }

    public void setName(String name) { //sets the name
        this.name = name;
    }

    public int getId() { //gets id
        return this.id;
    }

    public void setId(int id) { //sets the id
        this.id = id;
    }

    public double getPrice() { //gets price
        return this.price;
    }

    public void setPrice(double price) { //sets the price
        this.price = price;
    }

    public String getCategory() { //gets category
        return this.category;
    }

    public void setCategory(String category) { //sets the category
        this.category = category;
    }

    public abstract String getProductDetails(); //abstract method to get product details
}