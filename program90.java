class Demo{
	int x=10;
	Demo(){
		System.out.println("In no argument");
	}
	Demo(int x){
		System.out.println("In argument");
	}
	void m1(){
		System.out.println("In m1");
		System.out.println(x);
	}
	public static void main(String[]args){
		Demo obj1=new Demo();
		Demo obj2=new Demo(20);
		obj2.m1();
	}
}
