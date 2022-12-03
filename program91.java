class Demo{
	int x=30;
	Demo(){
		int x=20;
		System.out.println("In constructor");
		System.out.println(x);
		System.out.println(this.x);
	}
	Demo(int x){
		
		System.out.println("In constructor argu");
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String[]args){
		Demo obj1=new Demo();
		Demo obj2=new Demo(19);
	}
}
