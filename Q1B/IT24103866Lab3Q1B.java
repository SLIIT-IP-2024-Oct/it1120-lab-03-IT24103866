import java.util.Scanner;
public class  IT24103866Lab3Q1B {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double perKgprice = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double quantity = input.nextDouble();
		
		//given discount
		double discount = 0.9;
		
		//calculations
		double totalAmount = perKgprice*quantity*discount;
		
		System.out.println("");
		System.out.print("The total amount with 10% discount is: " + totalAmount);
		
	}
}