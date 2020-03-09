package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Task1();
    }
    public  static void Task1()
    {
        Polynomial f= new Polynomial();
        //adding coef
        Scanner in = new Scanner(System.in);
        for (int j=0;j<2;j++) {
            System.out.println("Enter the number of coef's of the expression");
            int noOfCo = in.nextInt();
            int k = 1;
            for (int i = 0; i < noOfCo; i++) {

                System.out.println("Enter coef >>");
                int coef = in.nextInt();
                System.out.println("Position of the coef entered >>");
                int pos = in.nextInt();
                f.addCoef(coef, pos - 1);
                System.out.println("Enter exponent");
                int exp = in.nextInt();
                f.addExpo(exp, pos - 1);
                System.out.println("coef " + k + " successfully added");
                k++;
            }

        }
        //form and display the polynomial

            f.formExpre();


        //evaluate a numbmer
        System.out.println("Enter x value to be evaluated>>");
        Scanner input= new Scanner(System.in);
        int x= input.nextInt();
        System.out.println(" The answer is : "+ f.evaluate(x));
    }
}
