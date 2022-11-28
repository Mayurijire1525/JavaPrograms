class Three{
	public static void main(String[]args){
		int arr[][][]=new int[][][]{{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}}};

		for(int plane=0; plane<2; plane++){
			for(int row=0; row<3; row++){
				for(int col=0; col<3; col++){
					System.out.print(arr[plane][row][col]+"");
				}
				System.out.println();
			}
		}
	}
}
