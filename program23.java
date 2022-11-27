class perfect{
	public static void main(String[]args){
		int num=10;
		int sum=0;

		for(int i=1; i<6; i++){
			if(num%i==0){
				sum=sum+i;
			}
		}
		if(sum==num){
			System.out.println(num+"is perfect number");
		}
		else{
			System.out.println(num+"is not perfect number");
		}
	}
}
