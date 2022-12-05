class Demo{
	void m1(int x,float y){
		System.out.println("Int float");
	}
	void m1(float x,int y){
		System.out.println("int float");
	}
}
class Main{
	public static void main(String[]args){
		Demo d=new Demo();
		d.m1(10,10.5f);
	}
}
