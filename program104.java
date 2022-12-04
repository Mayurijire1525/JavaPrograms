class parent{
	void marry(){
		System.out.println("Dipika");
	}
}
class child extends parent{
	void marry(){
		System.out.println("kirti");
	}
}
class Demo{
	public static void main(String[]args){
		parent p=new child();
		p.marry();
	}
}
