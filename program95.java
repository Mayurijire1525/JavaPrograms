class parent{
	parent(){
		System.out.println("In parent const");
	}
}
class child extends parent{
	child(){
		System.out.println("In child const");
	}
}
class main{
	public static void main(String[]args){
		parent obj1=new parent();
		child obj2=new child();
	}
}
