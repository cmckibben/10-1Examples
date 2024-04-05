package org.example;

public class Example1 {
    public static void recur1(int n) {
        if (n > 0)
            recur1(n - 2);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        System.out.println("\nrecur1(6)"); recur1(6);
        System.out.println("\nrecur1(3)"); recur1(3);
        System.out.println("\nrecur1(5)"); recur1(5);
        System.out.println("\nrecur1(0)"); recur1(0);
    }
}
