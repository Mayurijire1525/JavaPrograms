class outer{
	int x=10;
	class Inner1{
		int x=20;

		class Inner2{
			int x=30;

			void m1(){
				System.out.println(this.x);
				System.out.println(Inner1.this.x);
				System.out.println(outer.this.x);
			}
		}
	}
	public static void main(String[]args){
		outer obj1=new outer();
		outer.Inner1 obj2=obj1.new Inner1();
		outer.Inner1.Inner2 obj3=obj2.new Inner2();
		obj3.m1();

	}
}
