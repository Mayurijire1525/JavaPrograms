class parent{
	int x=10;
	static int y=20;

	void m1(){
		System.out.println("In m1");
	}
	static void m2(){
		System.out.println("In m2");
	}
}
class child{
	parent p=new parent();
}
class demo{
	public static void main(String[]args){
		child c=new child();
		c.p.m1();
		c.p.m2();

		System.out.println(c.p.x);
		System.out.println(c.p.y);
	}
}
