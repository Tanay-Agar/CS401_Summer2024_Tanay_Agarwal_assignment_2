E-commerce Shopping Cart Program

Overview: This program implements a simple shopping cart system using Java. It includes an abstract `Product` class, three subclasses (`Book`, `Electronic`, and `Clothing`), a `ShoppingCart` class, and a `Main` class to run the program.

Classes
------

1)  Product: Abstract parent class with common attributes (`name`, `id`, `price`, `category`).
2)  Book: Extends `Product` with additional attributes (`author`, `genre`, `title`).
3)  Electronic: Extends `Product` with additional attributes (`brand`, `warranty`).
4)  Clothing: Extends `Product` with additional attributes (`size`, `material`).
5)  ShoppingCart: Manages products in the cart, calculates total price, and displays cart contents.
6)  Main: Provides a menu-driven interface for the user to interact with the shopping cart.

Menu Options in Main
--------------------

1) Add item to cart
2) Remove item from cart
3) View cart
4) View total price
5) Complete order

If option 1 is selected
	1) Confirmation Message: A confirmation message is displayed indicating that the item has been added to the cart.
	2) Return to Main Menu: The user is returned to the main menu to choose the next action.

If option 2 is selected
	1) A delete option is displayed where the user has to enter the number of the object they want removed.
	2) A confirmation is printed  when the item is deleted
	2) Return to Main Menu: The user is returned to the main menu to choose the next action.

If option 3 shows all the items in the cart with their name, id, category, and price. Other details are shown as well depending on the item.
If option 4 is selected it shows the total price of all the items in the cart
If option 5 is selected it shows all the items in the cart and the final price. 

## Error Handling

- Sends user back to the first option menu if invalid input is selected. 
- Prevents selection of invalid menu options or items.
