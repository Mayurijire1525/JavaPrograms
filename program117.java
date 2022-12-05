class Demo{
	void m1(int x){
		System.out.println("In m1 int");
	}
	void m1(char ch){
		System.out.println("In m1 char");
	}
	void m1(float f){
		System.out.println("In m1 float");
	}
	void m1(double d){
		System.out.println("In m1 double");
	}
}
class Main{
	public static void main(String[]args){
		Demo d=new Demo();
		d.m1(10);
		d.m1('M');
		d.m1(10.2f);
		d.m1(19.222);
	}
}
