package com.multithreading;

import java.util.Scanner;

class Test1 extends Thread {
    @Override
    public void run() {
        System.out.println("Addition Task Started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Num:");
        int a = scan.nextInt();
        System.out.println("Enter the Second Num:");
        int b = scan.nextInt();
        System.out.println("Sum: " + (a + b));
        System.out.println("Addition Task Ended");
    }
}

class Test2 extends Thread {
    @Override
    public void run() {
        System.out.println("Print Char Task Started");
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Print Char Task Ended");
    }
}

class Test3 extends Thread {
    @Override
    public void run() {
        System.out.println("Print Num Task Started");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Print Num Task Ended");
    }
}

public class Another_way_to_achieve_multithreading {

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();
        Test3 t3 = new Test3();

        t1.start();
        t2.start();
        t3.start();
    }
}
