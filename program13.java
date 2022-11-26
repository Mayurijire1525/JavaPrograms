class IF{
	public static void main(String[]args){
		int x=10;
		if(x>0){
			System.out.println("Greater");
		}
		else if(x<0){
			System.out.println("Less");
		}
		else if(x==0){
			System.out.println("Equal");
		}
		else{
			System.out.println("None");
		}
		System.out.println("In main");
	}
}
