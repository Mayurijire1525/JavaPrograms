class parent{
	int x=10;
	static int y=20;
	parent(){
		System.out.println("In parent const");
	}
	static{
		System.out.println("In static block P");
	}
}
class child extends parent{
	int a=30;
	static int b=40;

	child(){
		System.out.println("In child const");
	}
	static{
		System.out.println("In static block C");
	}
}	
class main{
	public static void main(String[]args){
		parent obj1=new parent();
		child obj2=new child();
	}
}
