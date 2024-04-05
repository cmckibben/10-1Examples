package org.example;

public class Example5 {
    public static void recur5 (int n){
        if (n > 1)
            recur5(n -1);
        System.out.print (n+ " ");
    }

    public static void main(String[] args) {
        System.out.println("\nrecur5( 12)"); recur5(12);
        System.out.println("\nrecur5(  8)"); recur5(8);
        System.out.println("\nrecur5(-50)"); recur5(-50);
    }
}
