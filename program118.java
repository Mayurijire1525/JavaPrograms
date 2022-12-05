class Demo{
	void m1(int x){
		System.out.println("In m1 int");
	}
	void m1(char ch){
		System.out.println("In m1 char");
	}
}
class Main{
	public static void main(String[]args){
		Demo d=new Demo();
		d.m1('M');
	}
}
