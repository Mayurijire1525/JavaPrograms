class pattern{
	public static void main(String[]args){
		int num=1;
		char ch='a';
		for(int row=1; row<=4; row++){
			for(int col=1; col<=4; col++){
				if(col==2||col==4){
					System.out.print(ch+" ");
					ch++;
				}
				else{
					System.out.print(num+" ");
					num++;
				}
			}
			//num++;
			//ch++;
			System.out.println();
		}
		
	}
}
