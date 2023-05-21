import java.util.Scanner;

public class Salestax{
	public static void main(String[] args){
		final double tax_rate = 0.055;
		double tax;
		double price;
		double total;
		String item;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter items description :");
		item = keyboard.nextLine();
		System.out.print("Enter items price :");
		price = keyboard.nextDouble();
		
		tax = price * tax_rate;
		total = price + tax;

		System.out.println("The total price is $"+total);
}
}
		