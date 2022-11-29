class hashcode{
	public static void main(String[]args){
		String str1=new String("shashi");
		String str2=new String("shashi");
		String str3=new String("shashi");

		String str4="shashi";
		String str5="shashi";

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
	}
}
