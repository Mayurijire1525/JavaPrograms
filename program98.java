class parent{
	static{
		System.out.println("In static block P");
	}
}
class child extends parent{
	
	static{
		System.out.println("In static block C");
	}
	public static void main(String[]args){
		parent obj1=new parent();
		
	}
}
