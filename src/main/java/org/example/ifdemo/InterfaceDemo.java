package org.example.ifdemo;

public class InterfaceDemo {
    public static void main(String[] args) {

    }
}

@FunctionalInterface
interface MyInterface {
    int MY_INT = 3;
    int addTwoNumbers(int a, int b);

    default int subTwoNumbers(int a, int b) {
        test();
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
    private void test() {
        System.out.println("test... private");
    }
}