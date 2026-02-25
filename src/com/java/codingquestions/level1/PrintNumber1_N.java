package com.java.codingquestions.level1;

import java.util.Scanner;

public class PrintNumber1_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }
    }
}
