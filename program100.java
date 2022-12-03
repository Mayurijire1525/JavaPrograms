class parent{
	static{
		System.out.println("In static block P");
	}
}
class child1 extends parent{
	
	static{
		System.out.println("In static block C1");
	}
}	
class child2 extends parent{
	static{
		System.out.println("In static block C2");
	}

}
class main{
	public static void main(String[]args){
		
		child2 obj2=new child2();
	}
}
