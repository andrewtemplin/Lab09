import java.util.Scanner;

public class Class01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		System.out.println("Input a number between 1 and 50: ");
		num1 = scan.nextInt();
		
		System.out.println(num1);
		
		System.out.println("Input a second number between 1 and 50: ");
		num2 = scan.nextInt();
		
		System.out.println(num2);
		int product = num1 * num2;
		
		if (product < 40)
			System.out.println("You chose very small numbers");
		System.out.println("Product of num1 and num2: " + product);
		}}
