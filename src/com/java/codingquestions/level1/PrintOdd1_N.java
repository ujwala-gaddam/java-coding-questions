package com.java.codingquestions.level1;

import java.util.Scanner;

public class PrintOdd1_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int num = sc.nextInt();
        int i = 1;
        while(i<=num) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }    }
}
