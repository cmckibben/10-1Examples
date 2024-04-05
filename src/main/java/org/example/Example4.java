package org.example;

public class Example4 {
    public static void recur4 (int n){
        if (n > 1)
            recur4(n / 10);
        System.out.print (n % 10 + " ");
    }

    public static void main(String[] args) {
        System.out.println("\nrecur4(1457)"); recur4(1457);
        System.out.println("\nrecur4(1881)"); recur4(1881);
        System.out.println("\nrecur4( -50)"); recur4(-50);
    }
}
