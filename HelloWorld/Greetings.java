import java.util.Scanner;

public class Greetings{
	public static void main(String[] xyz){
		String name;
		int age;
		char grade;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your name :");
		name = keyboard.nextLine();
		System.out.print("Enter your age :");
		age = keyboard.nextInt();
		System.out.print("Enter your grade :");
		grade = keyboard.nextLine().charAt(0);

		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Grade :"+grade);
}
}