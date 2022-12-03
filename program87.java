class Instance{
	{
	System.out.println("In instance block");
	}
	Instance(){
		System.out.println("In constructor");
	}
	public static void main(String[]args){
		Instance obj=new Instance();
		System.out.println("In main method");
	}
}

