class Parent{
}
class child extends Parent{
}
class Demo{
	void m1(Parent p){
		System.out.println("In parent");
	}
	void m1(child p){
		System.out.println("In child");
	}
	public static void main(String[]args){
		Demo d=new Demo();
		d.m1(new Parent());
		d.m1(new child());

	}
}
