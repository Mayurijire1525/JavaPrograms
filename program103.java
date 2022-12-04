class parent{
	parent(){
		System.out.println("In constructor P");
	}
	void m1(){
		System.out.println("In method m1");
	}
}
class child extends parent{

	child(){
		System.out.println("In constructor C");
	}
	void m2(){
		System.out.println("In method m2");
	}
}
class Demo{
	public static void main(String[]args){
		parent p=new parent();
		p.m1();
		

		child c=new child();
		c.m1();
		c.m2();

		parent p1=new child();
		p1.m1();
		
	}
}
