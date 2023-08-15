package onlineShopCart;

import java.util.*;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Implement a method to calculate the total price
	//for a specific quantity of the product.
	public double calculateTotalPrice( int requestedQuantity) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the quantity of your product: ");
		int quantity = scanner.nextInt();
		
		if(quantity < 0 ) {
			System.out.println("Invalid quantity, please enter the valid quantity!");
			return 0.0;
		}
		return price * quantity;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
