import java.util.*;
class OneD{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter element");
		int num=sc.nextInt();

		int [] arr=new int[num];
		for(int i=0; i<num; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array element");

		for(int i=0; i<num; i++){
			System.out.println(arr[i]+"");
		}
		int max=0,index=0;

		for(int i=0; i<num; i++){
			if(max<index){
				max=arr[i];
				index=i;

			}
		}
		System.out.println("max"+max+"at index"+index);
	}
}
