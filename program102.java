class parent{
	int x=10;
	static int y=20;

	static{
		System.out.println("In static p");
	}
	parent(){
		System.out.println("In constructor p");
	}
}
class child{
	parent p=new parent();
	static{
		System.out.println("In static c");
	}
	child(){
		System.out.println("In constructor c");
	}

}
class Demo{
	public static void main(String[]args){
		child c=new child();
	}
}
