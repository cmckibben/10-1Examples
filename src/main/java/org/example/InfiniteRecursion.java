package org.example;

public class InfiniteRecursion {
    private static int runs = 0;
    private static void recurInfinite() {
        System.out.println("Run: " + runs);
        runs++;
        recurInfinite();
    }
    public static void main(String[] args) {
        recurInfinite();
    }
}
