package org.example;

public class Example3 {
    public static void recur3(int n) {
        if (n > 0)
            recur3(n - 10);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        System.out.println("\nrecur3( 50)"); recur3( 50);
        System.out.println("\nrecur3( 18)"); recur3( 18);
        System.out.println("\nrecur3(-50)"); recur3(-50);
    }
}
