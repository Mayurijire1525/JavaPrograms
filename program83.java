class ThreadDemo extends Thread{
	public void run(){
		for(int i=0; i<50; i++){
			System.out.println("Thread-1");
		}
	}
	public static void main(String[]args){
		Thread obj=new Thread(new ThreadDemo());
		obj.start();

		for(int i=0; i<50; i++){
			System.out.println("main");
		}
	}
}
