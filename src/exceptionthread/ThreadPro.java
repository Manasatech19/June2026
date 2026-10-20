package exceptionthread;

public class ThreadPro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String threadname=Thread.currentThread().getName();
		System.out.println("current thread name= "+threadname);
		System.out.println("display current thread= "+Thread.currentThread());
		
		Thread t=new Thread();
		t.setName("new thread");
		System.out.println(t);
		
		for(int i=1;i<=5;i++) {
			Thread.sleep(2000);
			System.out.println(i);
		}

	}

}
