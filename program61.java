import java.io.*;
class Arrinput{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter size of array");

		int n=Integer.parseInt(br.readLine());

		char [] carr=new char[n];

		for(int i=0; i<n; i++){
			carr[i]=(char)br.read();
			br.skip(1);
		}

			for(int i=0; i<n; i++){
				System.out.println(carr[i]);
			}
		}
	}

