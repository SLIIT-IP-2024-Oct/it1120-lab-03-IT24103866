import java.util.Scanner;
public class IT24103866Lab3Q1A {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double priceperKg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double quantity = input.nextDouble();
		
		//calculatons 
		double totalPrice = priceperKg*quantity;
		
		System.out.println("");
		System.out.print("The total amount is: " + totalPrice);
		
	}
}
		
		 
		