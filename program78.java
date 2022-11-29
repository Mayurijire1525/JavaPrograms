class method{
	public static void main(String[]args){
		//1.concat
		String str1="c2w";
		String str2="Binecaps";
		System.out.println(str1.concat(str2));

		//2.length
		System.out.println(str1.length());

		//3.compareto(string)
                String str3="shashi";
		String str4="Shashi";
		System.out.println(str3.compareTo(str4));

		//4.compareToIgnoreCase(String)
		System.out.println(str3.compareToIgnoreCase(str4));

		//5.equals
		System.out.println(str3.equals(str4));

		//6.startswith(string)
		str1="c2wtech";
		System.out.println(str1.startsWith("c2w"));

		//7.booleanequalsIgnoreCase(String)
		System.out.println(str1.equalsIgnoreCase(str2));

		//8.endwith
		System.out.println(str1.endsWith("tech"));

		//9.toUppercase()
		str1="c2wtech";
		System.out.println(str1.toUpperCase());

		//10.tolowercse()
		str1="C2WTECH";
		System.out.println(str1.toLowerCase());

		//11.replace
		str1="core2web";
		System.out.println(str1.replace('e','x'));

		//12.substring()
		str1="binecaps";
		System.out.println(str1.substring(4));

		//13.trim
		str1="         c2w   ";
		System.out.println(str1.trim());

		
	
}
}
