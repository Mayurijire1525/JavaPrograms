class identityhash{
	public static void main(String[]args){
		String str1=new String("Core2web");
		String str2="Core2web";
		String str3="core2web";

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
