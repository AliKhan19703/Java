import java.util.Scanner;

public class Pay{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double hours;
		double pay;
		double rate;
		
		System.out.print("How many hours did you worked :");
		hours = keyboard.nextDouble();
		System.out.print("How much did you get paid :");
		rate = keyboard.nextDouble();
		
		if (hours <= 40){
			pay = hours * rate;
		}
		else{
			pay = (hours - 40)*(1.5*rate) + 40 * rate;
		}
		
		System.out.println("You earned $" + pay);
}
}