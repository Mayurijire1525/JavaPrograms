class outer{
	class Inner{
		int x=30;

		void m1(){
			System.out.println(x);
		}
	}
	static void m2(){
		outer o=new outer();
		outer.Inner i=o.new Inner();
		i.m1();
	}
	public static void main(String[]args){
		outer.m2();
	}
}

