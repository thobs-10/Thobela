package com.company;

public class Triangle extends Shape {
    private float  base;
    private float height;
    public Triangle(float H, float B)
    {
        this.base=B;
        this.height=H;
    }
    public float getArea()
    {
        return (float) (0.5*(height*base));
    }
    public void display()
    {
        System.out.println("triangle :"+ getArea());
    }
    public void setBase(float B){this.base=B;}
    public void setHeight(float H){this.height=H;}
    public float getBase(){return base;}
    public float getHeight(){return height;}
}
