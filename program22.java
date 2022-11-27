class prime{
	public static void main(String[]args){
		int num=41;
		boolean flag=false;

		for(int i=2; i<num; i++){
			
			if(num%i==0){
			        flag=true;
				break;

			}
		}
		if(flag==true){
			System.out.println(num+"is prime number");
		}
		else{
			System.out.println(num+"is not prime number"); 

		}
	}
}
