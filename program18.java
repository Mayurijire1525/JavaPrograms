class Switch1{
	public static void main(String[]args){
		char ch='B';
		switch(ch){
			case 'A':
			case 'a':
				if(ch==65){
					System.out.println("Capital A");
				}
				else{
					System.out.println("Small a");
				}
				break;
			case 'B':
				System.out.println("Capital B");
				break;

			case 67:
				System.out.println(67);
				break;
			default:
				System.out.println("Default");
				break;
		}
	}
}
