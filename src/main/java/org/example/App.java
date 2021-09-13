/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;

class math {

    public static void main(String args[]) {

        System.out.print("What is the first number? ");
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        int a = Integer.parseInt(num1);

        System.out.print("What is the second number? ");
        String num2 = sc.nextLine();
        int b = Integer.parseInt(num2);

        if(a>0 && b>0)
        {
            System.out.println(a + " + " + b + " = " + (a + b) + "\n" + a + " - " + b + " = " + (a - b) + "\n" +
                    a + " * " + b + " = " + (a * b) + "\n" + a + " / " + b + " = " + (a / b) + "\n");
        }else
        {
            System.out.println("Enter positive numbers");
        }




    }
}