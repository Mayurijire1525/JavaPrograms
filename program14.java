import java.util.*;
class demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number");
		int num=sc.nextInt();

		if(num%2==0){
			System.out.println("Is divisible");
		}
		else{
			System.out.println("Not divisible");
		}
	}
}
