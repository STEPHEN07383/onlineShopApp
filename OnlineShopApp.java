package onlineShopCart;

import java.util.*;

public class OnlineShopApp {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Product p1 = new Product("milk", 20, 10);
        Product p2 = new Product("Unga", 290, 2);
        Product p3 = new Product("Sugar",410, 1);
        Product p4 = new Product("Ink", 120, 3);
        Product p5 = new Product("Bulb", 200, 1);

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        // Implement a loop to present a menu to the user
        // with options like "Add to Cart,"
        // "View Cart," and "Proceed to Checkout."

        // 1. Create a shopping cart to store selected products
        ArrayList<Product> shoppingCart = new ArrayList<>();

        String[] options = {
            "1. Add to Cart",
            "2. View Cart",
            "3. Proceed to Checkout"
        };

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            for (int i = 0; i < options.length; i++) {
                System.out.println(options[i]);
            }

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Implement code to add product to the shopping cart
                    System.out.println("Available products:");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i).getName());
                    }
                    System.out.print("Enter the product number to add to cart: ");
                    int productNumber = scanner.nextInt();
                    if (productNumber >= 1 && productNumber <= products.size()) {
                        Product selectedProduct = products.get(productNumber - 1);
                        shoppingCart.add(selectedProduct);
                        System.out.println(selectedProduct.getName() + " added to cart.");
                    } else {
                        System.out.println("Invalid product number.");
                    }
                    break;
                case 2:
                    // Implement code to view the shopping cart
                    System.out.println("Cart Contents:");
                    for (Product product : shoppingCart) {
                        System.out.println(product.getName() + " - " + product.getPrice());
                    }
                    break;
                case 3:
                    // Implement code to proceed to checkout
                    double total = 0;
                    System.out.println("Cart Contents:");
                    for (Product product : shoppingCart) {
                        System.out.println(product.getName() + " - " + "$" + product.getPrice());
                        total += product.getPrice();
                    }
                    System.out.println("Total Price: " + "$" + total);
                    System.out.println("Thank you for shopping with us!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
