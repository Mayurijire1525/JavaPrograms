class outer{
	class Inner{
		int x=30;

		void m1(){
			System.out.println(x);
		}
	}
	void m2(){
		Inner i=new Inner();
		i.m1();
	}
	public static void main(String[]args){
		outer o=new outer();
		o.m2();
	}
}
