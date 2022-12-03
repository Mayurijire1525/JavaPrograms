class parent{
	void m1(){
		System.out.println("In m1");
	}
	static void m2(){
		System.out.println("In m2");
	}
}
class child extends parent{
	void m3(){
		System.out.println("In m3");
	}
}
class main{
	public static void main(String[] args){
		child obj=new child();

		obj.m1();
		obj.m2();
		obj.m3();
	}
}
