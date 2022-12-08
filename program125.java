class parent{
	void m1(){
		System.out.println("In parent");
	}
}
class child extends parent{
	void m1(){
		System.out.println("In child");
	}
	public static void main(String[]args){
		parent p=new child();
		p.m1();
	}
}
