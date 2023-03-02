package org.example;

import java.util.Scanner;
class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        int FirstNum = 0, SecondNum = 1;
        int i = 1;
        while (i <= a) {
            System.out.println(FirstNum);
            int nextTerm = FirstNum + SecondNum;
            FirstNum = SecondNum;
            SecondNum = nextTerm;
            i++;
        }
        System.out.println("Fibonacci Series  ");
    }
}


