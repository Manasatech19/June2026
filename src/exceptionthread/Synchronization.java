package exceptionthread;

class Maths{
	synchronized void multable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));	
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
class Thread1 extends Thread{
	Maths obj;
	public Thread1 (Maths obj) {
		this.obj=obj;	
	}
	public void run() {
		obj.multable(2);
	}
	
}
class Thread2 extends Thread{
	Maths obj;
	public Thread2(Maths obj) {
		this.obj=obj;
	}
	public void run() {
		obj.multable(3);
	}
}
class Thread3 extends Thread{
	Maths obj;
	public Thread3(Maths obj) {
		this.obj=obj;
	}
	public void run() {
		obj.multable(6);
		
	}
}
public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths obj=new Maths();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		Thread3 t3=new Thread3(obj);

		t1.start();
		t2.start();
		t3.start();

	}

}
