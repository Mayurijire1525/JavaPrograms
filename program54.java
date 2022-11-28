import java.util.*;
class inputdemo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter input");
		System.out.println(sc.next());

		String x=sc.next();
		String y=sc.next();

		System.out.println(x);
		System.out.println(y);

		System.out.println(x+y);

		int var1=Integer.parseInt(x);
		int var2=Integer.parseInt(y);
		System.out.println(var2+var2);
	}
}
