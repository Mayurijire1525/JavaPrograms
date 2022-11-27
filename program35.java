class pattern{
	public static void main(String[]args){
		int num=1;
		for(int row=1; row<4; row++){
			for(int col=1; col<4; col++){
				if(num%2==0){
					System.out.print(num*num+" ");
					num++;
				}
				else{
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
		}
	}
}
