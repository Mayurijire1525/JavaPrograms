class Demo{
	Demo(){
		System.out.println("In no argument");
	}
	Demo(int x){
		System.out.println("In argument");
	}
	public static void main(String[]args){
	Demo obj1=new Demo();
	Demo obj2=new Demo(10);
	Demo obj3=new Demo('A');
	}
}
