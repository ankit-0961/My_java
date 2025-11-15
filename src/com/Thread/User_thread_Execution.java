package com.Thread;

class Demooo1 extends Thread 
{
	@Override
	public void run () {
		System.out.println("user thread started executing");
		for(int i=1;i<=5;i++) {
			System.out.println("user thread");
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) { 
				e.printStackTrace();
			}
		}
		System.out.println("user thread finished Execution");
	}
}

public class User_thread_Execution {

	public static void main(String[] args) {
		
		System.out.println("main Thread started ");
	Demooo1 d1	=new Demooo1();
	d1.start();

	System.out.println("main Thread finished");
	}

}
