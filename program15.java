import java.util.*;
class demo2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");

		int num=sc.nextInt();

		if(num%4==0 && num%5==0){
			System.out.println("Is divisible is by 4&5");
		}
		else{
			System.out.println("Is divisible is not by 4&5");
		}
	}
}
