class Demo1{
	int var1=10;
	static int var2=20;

	void methodone(){
		System.out.println("In non static method");
	}
	static void methodtwo(){
		System.out.println("In static method");
	}
	public static void main(String[]args){
		System.out.println(var2);
		methodtwo();

		Demo1 obj=new Demo1();

		System.out.println(obj.var1);
		obj.methodone();
	}
	}

