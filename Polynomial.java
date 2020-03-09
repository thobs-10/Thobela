package com.company;

import java.util.ArrayList;

public class Polynomial {
    private float coef;
    private int[]  expression;
    private int[] expo;
    public Polynomial(/*float C*/)
    {
        //this.coef=C;
        expression = new int[6];
        expo= new int[expression.length];
    }
    public  void addCoef(int co,int coPos)
    {
        expression[coPos]= co;
    }
    public  void addExpo(int exp,int expPos)
    {
        expo[expPos]=exp;
    }

    public void formExpre()
    {
             for(int i=0;i<expression.length;i+=3) {
                 System.out.println(" " + expression[i] + "x^" + expo[i] + "+ " + expression[i + 1] + "x^" + expo[i + 1] + "+ " + expression[i + 2]);

             }
    }
    public void setCoef(int coPos, int value)
    {
        if(expression.length!=0)
        {
            expression[coPos]=value;
        }
    }
    public int getCoef(int coPos)
    {
        if(expression.length!=0) {
            return expression[coPos];
        }
        return -1;
    }
    public  int evaluate(int x)
    {
        double answr= expression[0]*expo[0]*x + expression[1]*expo[1]*x + expression[2];
        return (int)answr;
    }
}
