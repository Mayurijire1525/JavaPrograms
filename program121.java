class Demo{
	void m1(int x,int y){
		System.out.println("Int int");
	}
	void m1(float x,float y){
		System.out.println("float float");
	}
}
class Main{
	public static void main(String[]args){
		Demo d=new Demo();
		d.m1(10.5f,10);
	}
}
