class parent{
	void p1(){
		System.out.println("In p1");
	}
}
class child extends parent{
	void p2(){
		System.out.println("In p2");
	}
}
class Demo{
	void m1(parent p){
		System.out.println("In m1 p");
	}
	void m1(child p){
		System.out.println("In m1 c");
		p.p1();
		p.p2();
	}
	public static void main(String[]args){
		Demo d=new Demo();
		d.m1(new child());
		d.m1(new parent());
	}

}
