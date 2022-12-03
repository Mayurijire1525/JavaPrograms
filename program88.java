class Instance{
	int x=10;

	void m1(){
		int z=30;
		System.out.println(z);
	}
	public static void main(String[]args){
		Instance obj=new Instance();

		System.out.println(obj.x);
		
		obj.m1();
	}
}
