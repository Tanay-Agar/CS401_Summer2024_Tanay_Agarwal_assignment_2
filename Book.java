/**
 * Class: Book
 *
 * <p>
 * Implements a very simple book item class. It is the child class of Product.
 * </p>
 *
 * @author Tanay Agarwal
 * @version Version Number 1.0
 * @since June, 18th, 2024
 */

package ecommerce.com; //Package

public class Book extends Product {
    private String author; //private string variable author
    private String genre; //private string variable genre
    private String title; //private string variable title

    public Book(String name, int id, double price, String author, String title, String genre) { //constructor
        super(name, id, price);
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.category = "Book"; // Set protected category variable
    }

    public String getAuthor() { //gets author
        return this.author;
    }

    public void setAuthor(String author) { //sets author
        this.author = author;
    }

    public String getGenre() { //gets genre
        return this.genre;
    }

    public void setGenre(String genre) { //sets genre
        this.genre = genre;
    }

    public String getTitle() { //gets title
        return this.title;
    }

    public void setTitle(String title) { //sets title
        this.title = title;
    }

    @Override
    public String getProductDetails() { //overrides getProductDetails method
        return "Book{title='" + title + "', author='" + author + "', genre='" + genre + "', name='" + getName() + "', id=" + getId() + ", price=" + getPrice() + ", category='" + category + "'}";
    }
}