package com.java.codingquestions.level1;

import java.util.Scanner;

public class PrintNumberN_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();
        for (int i = num ; i>=1; --i) {
            System.out.println(i);

        }
    }
}