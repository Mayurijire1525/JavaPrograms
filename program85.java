class Static{
	static void m1(){
		System.out.println("In static method");
	}
	public static void main(String[]args){
		m1();
		Static.m1();
		Static obj=new Static();
		obj.m1();
	}
}
