package Assignment14;

public class Question1 extends Thread{
	
	int i=1;
	public synchronized void run() {
	  while(i<=500){
		 System.out.println("1st thread="+i);
		 i++;
	  }
	  try {
		  Thread.sleep(100);
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }

	}

	public static void main(String[] args) throws InterruptedException {
      Question1 task1=new Question1();
      Thread a=new Thread(task1);
	   Task2 task2=new Task2();
	   Thread b=new Thread(task2);
	   a.start();
	   a.join();
	   b.start();
	   b.join();

	}

}
class Task2 implements Runnable{
	int i=501;
	public synchronized void run() {
	while(i<=1000){
			System.out.println("2ndthread="+i);
			i++;
		}
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}