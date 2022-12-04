class Mall{
	int x=10;
	static int y=20;

	void m1(){
		System.out.println("In m1-mall");
	}
	class shop{
		int x=30;

		void m1(){
			System.out.println("In m1 shop");
		}
	}
}
class Demo{
	public static void main(String[]args){
		Mall m=new Mall();
		Mall.shop s=m.new shop();
		m.m1();
		s.m1();
	}
}
