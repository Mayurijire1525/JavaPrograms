import java.util.Scanner;
import java.lang.*;
import java.util.Locale;
public class project{
	public static void main(String[] args){
		float num1,num2;
		System.out.println("Enter first number");

		Scanner scan=new Scanner(System.in);
		num1=scan.nextFloat();
		
		System.out.println("Enter second number");
		num2=scan.nextFloat();

		System.out.print("Enter numbers are: ");
		System.out.print(num1);
		System.out.print(" and ");
		System.out.println(num2);

		String message="Enter 1 for Addition,2 for Substraction,3 for Multiplication and 4 for Division";
		System.out.println(message);

		int value=scan.nextInt();

		switch(value){

			case 1:
				System.out.print("The result after addition of entered numbers is: ");
				System.out.println(num1 + num2);
				break;
			case 2:
				System.out.print("The result after Substraction of entered numbers is: ");
				System.out.println(num1 - num2);
				break;
			case 3:
				System.out.print("The result after Multiplication of entered numbers is: ");				System.out.println(num1 * num2);
				break;
			case 4:
				System.out.print("The result after Division of entered numbers is: ");
				System.out.println(num1 / num2);
				break;
			default:
				System.out.println("Invalid input");

	}
}
}
