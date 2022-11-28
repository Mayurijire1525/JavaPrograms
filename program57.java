import java.io.*;
class buffer{
	public static void main(String[]args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);

		BufferedReader br=new BufferedReader(isr);

		String str=br.readLine();

		System.out.println(str);
	}
}
