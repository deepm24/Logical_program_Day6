package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        while (a)
        {
            System.out.println("Enter No.1 for Fibonacci Series");
            System.out.println("Enter No.2 for Perfect Number");
            System.out.println("Enter No.3 for Check Prime number");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    FibonacciSeries();
                    a = false;
                    break;
                case 2:
                    PerfectNumber();
                    a = false;
                    break;
                case 3:
                    PrimeNumber();
                    a = false;
                    break;
                default:
                    System.out.println(" Please Enter Right No ");
            }
        }
    }

    static void FibonacciSeries() {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
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

    static void PerfectNumber() {
        System.out.println("Enter your Number");
        int Num, Sum = 0;
        Scanner sc = new Scanner(System.in);
        Num = sc.nextInt();
        for (int i = 1; i <= Num; i++) {
            if (Num % i == 0) {
                Sum = Sum + i;
            }
        }
        if (Sum == Num) {
            System.out.println("Perfect Number:" + Sum);
        } else {
            System.out.println("Not Perfect:" + Num);
        }
    }
    static void PrimeNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is truly prime number or not: ");
        int number, sum = 0;
        number = sc.nextInt();
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                sum++;
            }
        }
        if (sum == 2)
            System.out.println("This Number is Prime Number:");
        else
            System.out.println("This Number is NOT Prime Number:");
    }

}


