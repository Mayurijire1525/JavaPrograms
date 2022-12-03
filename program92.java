class Demo{
	int x=10;
	static int y=20;
	Demo(){
		System.out.println("In Demo()");
	}
	Demo(int x){
		System.out.println("In Demo(int)");
	}
	Demo(Demo obj){
		System.out.println("In Demo(Demo)");
		obj.m1();
	}
	void m1(){
		System.out.println(this);
	}
	public static void main(String[]args){
		Demo obj1=new Demo();
		obj1.m1();

		Demo obj2=new Demo(10);
		obj2.m1();

                Demo obj3=new Demo();
		obj3.m1();
	}
}
