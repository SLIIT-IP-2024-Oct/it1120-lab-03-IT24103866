import java.util.Scanner;
public class IT24103866Lab3Q2 {
	public  static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		double monthlySalary = input.nextDouble();
		
		System.out.print("Enter the number of OT hour: ");
		double otHours = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		double otHourlyRate = input.nextDouble();
		
		//calculations
		double otAmount = otHours*otHourlyRate;
		double salary = monthlySalary+otAmount;
		
		System.out.println("");
		System.out.print("The total salary including OT is: "+salary);
		
	}
}