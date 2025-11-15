package com.Thread;

class Eclipse implements Runnable{
	public void run() {
		Thread t= Thread.currentThread();
		String name =t.getName();
		
		if(name.equals("Type")) {
			codeType();
		}else if(name.equals("code")) {
			codeComplete();
		}else {
			autosave();
		}
	}
	
	void codeType() {
		System.out.println("code typing started ");
		
		for(int i=1;i<=5;i++) {
			System.out.println("Typing");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("typing task ended");
	}
	void codeComplete() {
//		System.out.println("code completion started");
		for (;;) {
			System.out.println("Code complete");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			   e.printStackTrace();
			}
		}
	
	}
	void autosave() {
		System.out.println("autosaving started ");
		for(int i=0;i<=5;i++) {
			System.out.println("autosaving ..");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
}


public class Example {

	public static void main(String[] args) {
		Eclipse e=new Eclipse();
		
		Thread t1=new Thread(e);
		Thread t2=new Thread(e);
		Thread t3=new Thread(e);
		
		t1.setName("Type");
		t2.setName("code");
		t3.setName("save");
		
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		
		t1.start();
		t2.start();
		t3.start();

	}

}
