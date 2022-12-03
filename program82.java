class program{
	public static void main(String[]args){
		String str1="Rahul";

		StringBuffer sb= new StringBuffer(str1);
		System.out.println(sb);
		
		sb=sb.reverse();

		str1=sb.toString();
		System.out.println(sb);
		System.out.println(str1);


	}
}
