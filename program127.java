class parent{
	static void m1(){
		System.out.println("m1 parent");
	}
}
class child extends parent{
	static void m1(){
		System.out.println("m1 child");
	}
	public static void main(String[]args){
		parent p=new child();
		p.m1();
	}
}
