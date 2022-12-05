class Parent{
	void m1(){
		System.out.println("In m1");
	}
}
class Demo{
	public static void main(String[]args){
		Parent p=new Parent(){
			void m2(){
				System.out.println("In m2");
			}
		};
		p.m1();
	}
}
