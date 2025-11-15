package com.multithreading;

import java.util.Scanner;

class Demoo1 implements Runnable
{
	
	@Override
	public void run() {
		System.out.println("Addition Task Started");
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the First Num");
		int a=Scan.nextInt();
		System.out.println("Enter the second Num");
		int b=Scan.nextInt();
		System.out.println(a+b);
		System.out.println("Addition Task Ended");
	}
	
}


class Demoo2 implements Runnable
{
	
	@Override
	public void run() {
		System.out.println("Print char  Task Started");
		for(int i=65;i<=75;i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
				
			}
		}
		
		System.out.println("print char task ended");
	}
	
}

class Demoo3 implements Runnable
{
	
	@Override
	public void run() {
		System.out.println("print num task started");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
             e.printStackTrace();				
			}
		}
		System.out.println("print num task ended");
		}
	}



public class Efficient_way_to_create_multithreading {

	public static void main(String[] args) {
		
    Demoo1 d1=new Demoo1();
    Demoo2 d2=new Demoo2();
    Demoo3 d3=new Demoo3();
    
    
    Thread t1=new Thread(d1);
    Thread t2=new Thread(d2);
    Thread t3=new Thread(d3);
    
    
    
    t1.start();
    t2.start();
    t3.start();
	}

}
