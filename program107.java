class outer{
	int x=10;
	static int y=20;
	
	class Inner{
		void m1(){
		System.out.println(x);
		System.out.println(y);
}
}
public static void main(String[]args){
	outer o=new outer();
	outer.Inner i=o.new Inner();
	i.m1();

}

}

