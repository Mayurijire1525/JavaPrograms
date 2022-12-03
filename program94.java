class parent{
	int x=10;
	static int y=20;

}
class child extends parent{
	int z=30;
	static int w=40;

	void m1(){
		System.out.println("In m1");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
	}
}
class main{
	public static void main(String[]args){
		child obj=new child();
		obj.m1();
	}
}
