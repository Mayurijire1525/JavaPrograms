class Demo{
	void m1(long x){
		System.out.println("In m1 long");
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
	
		d.m1('M');
	
	}
}
