package org.example.ifdemo;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        Runnable r = () -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Another thread : " + i);
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i = 1; i <= 100; i++) {
            System.out.println("main thread : " + i);
        }
    }
}

/*
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("MyRunnable thread : " + i);
        }
    }
}*/
