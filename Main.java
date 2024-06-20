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

package ecommerce.com;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        // Initialize the shopping cart
        ShoppingCart myCart = new ShoppingCart();

        // Create product instances
        Product[] books = {
            new Book("Java Programming", 101, 29.99, "John Doe", "Learn Java", "Programming"),
            new Book("Python Programming", 102, 39.99, "Jane Doe", "Learn Python", "Programming"),
            new Book("C++ Programming", 103, 34.99, "Jim Beam", "Learn C++", "Programming")
        };

        Product[] electronics = {
            new Electronic("Smartphone", 202, 499.99, "TechBrand", "2 years"),
            new Electronic("Laptop", 203, 999.99, "CompTech", "1 year"),
            new Electronic("Tablet", 204, 299.99, "TabCorp", "1 year")
        };

        Product[] clothing = {
            new Clothing("T-Shirt", 303, 19.99, "M", "Cotton"),
            new Clothing("Jeans", 304, 49.99, "L", "Denim"),
            new Clothing("Jacket", 305, 89.99, "XL", "Leather")
        };

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. View cart");
            System.out.println("4. View total price");
            System.out.println("5. Complete order");
            System.out.print("Enter your choice: ");

            int choice = -1;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
                continue; 
            }
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Choose category to add:");
                    System.out.println("1. Book");
                    System.out.println("2. Electronic");
                    System.out.println("3. Clothing");
                    System.out.print("Enter your choice: ");
                    int addCategory = -1;
                    try {
                        addCategory = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter an integer.");
                        scanner.next(); 
                        continue; 
                    }
                    System.out.println();
                    
                    switch (addCategory) {
                        case 1:
                            System.out.println("Choose book to add:");
                            for (int i = 0; i < books.length; i++) {
                                System.out.println((i + 1) + ". " + books[i].getName());
                            }
                            System.out.print("Enter your choice: ");
                            int addBookChoice = -1;
                            try {
                                addBookChoice = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter an integer.");
                                scanner.next(); 
                                continue; 
                            }
                            System.out.println();

                            if (addBookChoice > 0 && addBookChoice <= books.length) {
                                myCart.addProduct(books[addBookChoice - 1]);
                                System.out.println(books[addBookChoice - 1].getName() + " added to the cart.");
                            } else {
                                System.out.println("Invalid choice.");
                            }
                            break;

                        case 2:
                            System.out.println("Choose electronic to add:");
                            for (int i = 0; i < electronics.length; i++) {
                                System.out.println((i + 1) + ". " + electronics[i].getName());
                            }
                            System.out.print("Enter your choice: ");
                            int addElectronicChoice = -1;
                            try {
                                addElectronicChoice = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter an integer.");
                                scanner.next(); 
                                continue; 
                            }
                            System.out.println();

                            if (addElectronicChoice > 0 && addElectronicChoice <= electronics.length) {
                                myCart.addProduct(electronics[addElectronicChoice - 1]);
                                System.out.println(electronics[addElectronicChoice - 1].getName() + " added to the cart.");
                            } else {
                                System.out.println("Invalid choice.");
                            }
                            break;

                        case 3:
                            System.out.println("Choose clothing to add:");
                            for (int i = 0; i < clothing.length; i++) {
                                System.out.println((i + 1) + ". " + clothing[i].getName());
                            }
                            System.out.print("Enter your choice: ");
                            int addClothingChoice = -1;
                            try {
                                addClothingChoice = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter an integer.");
                                scanner.next(); 
                                continue; 
                            }
                            System.out.println();

                            if (addClothingChoice > 0 && addClothingChoice <= clothing.length) {
                                myCart.addProduct(clothing[addClothingChoice - 1]);
                                System.out.println(clothing[addClothingChoice - 1].getName() + " added to the cart.");
                            } else {
                                System.out.println("Invalid choice.");
                            }
                            break;

                        default:
                            System.out.println("Invalid category choice.");
                    }
                    break;

                case 2:
                    if (myCart.getTotalQuantity() == 0) {
                        System.out.println("Your cart is empty.");
                    } else {
                        System.out.println("Choose item to remove:");
                        List<Product> cartProducts = myCart.getProducts();
                        for (int i = 0; i < cartProducts.size(); i++) {
                            System.out.println((i + 1) + ". " + cartProducts.get(i).getName());
                        }
                        System.out.print("Enter your choice: ");
                        int removeChoice = -1;
                        try {
                            removeChoice = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter an integer.");
                            scanner.next(); 
                            continue; 
                        }
                        System.out.println();

                        if (removeChoice > 0 && removeChoice <= cartProducts.size()) {
                            Product removedProduct = cartProducts.get(removeChoice - 1);
                            myCart.removeProduct(removedProduct);
                            System.out.println(removedProduct.getName() + " removed from the cart.");
                        } else {
                            System.out.println("Invalid choice.");
                        }
                    }
                    break;

                case 3:
                    // Display the contents of the cart
                    System.out.println("Cart contents:");
                    myCart.showCartDetails();
                    System.out.println();
                    break;

                case 4:
                    // Display the total price
                    System.out.println("Total price: $" + myCart.getTotalPrice());
                    System.out.println();
                    break;

                case 5:
                    // Complete the order and exit the loop
                    System.out.println("Order completed. Final cart contents:");
                    myCart.showCartDetails();
                    System.out.println("Total price: $" + myCart.getTotalPrice());
                    System.out.println();
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        }

        scanner.close();
    }
}