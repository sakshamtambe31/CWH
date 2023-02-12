package com.company;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        for (int i=n; i>0; i--) {
            for (int j=i-1; j < i; j++)
                System.out.println("*");
        }
        System.out.println("\n");
    }
}
