package com.java.codingquestions.level2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = scanner.nextInt();
        int reverse=0;
        while(num>0){
            int digit = num%10;
            num=num/10;
            reverse = reverse*10+digit;
        }System.out.println(reverse);

    }
}
