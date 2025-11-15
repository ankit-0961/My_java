package com.Thread;

class Demoooo1 extends Thread {
    @Override
    public void run() {
        System.out.println("Daemon execution started");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Daemon thread executed");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Daemon execution finished");
    }
}

public class Daemon_thread_Execution {

    public static void main(String[] args) {
        System.out.println("Main thread execution started");

        Demoooo1 d1 = new Demoooo1();
        d1.setDaemon(true);
        d1.start();

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread execution finished");
    }
}
