package org.example;

public class Example2 {
    public static void recur2(int n) {
        if (n > 0) {
            recur2(n - 1);
            for (int i = 0; i < n; i++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("\nrecur2(6)"); recur2(6);
        System.out.println("\nrecur2(3)"); recur2(3);
        System.out.println("\nrecur2(1)"); recur2(1);

    }
}
