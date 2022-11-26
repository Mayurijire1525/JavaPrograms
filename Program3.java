class Demo{
	static int x=10;
	static int y=20;

	public static void fun(){
		System.out.println("In fun");
	}
	public static void run(){
		System.out.println("In run");
	}
	public static void main(String[]args){
		System.out.println(x);
		System.out.println(y);
		fun();
		run();
	}
}
