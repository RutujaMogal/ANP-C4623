package corejava;

public class EvenThread extends Thread{

	//to execute the code
		public void run()
		{
			for(int i=2;i<=10;i+=2)
			{
				System.out.println(Thread.currentThread()+":"+i);
				try
				{
					Thread.sleep(1000);//sleep for 1 second
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

 class OddThread extends Thread {

	//to execute the code
		public void run()
		{
			for(int i=1;i<=9;i+=2)
			{
				System.out.println(Thread.currentThread()+":"+i);
				try
				{
					Thread.sleep(1000);//sleep for 1 second
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	class ThreadExa
	{
		public static void main(String[] args) {
			//create and start three threads 
			OddThread t1=new OddThread();
			EvenThread t2=new EvenThread();
			
			t1.start();//to start the thread execution
			t2.start();
			
			//wait for all thread to finish
			try
			{
				t1.join();
				t2.join();
			
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("All Threads finished");
		}




}
