package exceptionthread;

class ThreadNew extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("new thread");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadNew ob=new ThreadNew();
		ob.start();
		for(int i=1;i<=5;i++){
			System.out.println("main thread");
			Thread.sleep(2000);
		}

	}

}
