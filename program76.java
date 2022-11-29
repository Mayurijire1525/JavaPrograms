class demo{
	demo(){
		System.out.println("No argument");
	}
	demo(int x){
		System.out.println(x+"With argument");
	}
	public static void main(String[]args){
		demo d=new demo();
		demo d1=new demo(10);
	}
}
