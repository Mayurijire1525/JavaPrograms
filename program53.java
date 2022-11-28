class Break{
	public static void main(String[]args){
		int[]arr=new int[]{10,20,30,40,50};
		
		for(int i=1; i<arr.length; i++){
			if(arr[i]%4==0){
				continue;
			}
			else{
				System.out.println(arr[i]);
			}
		}
	}
}
