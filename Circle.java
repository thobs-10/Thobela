package com.company;

 class Circle extends Shape{
    float radius;
    public Circle(float C)
    {
        this.radius=C;
    }
    public float getArea()
    {
        return (float) Math.PI* radius*2;
    }
    public void display()
    {
        System.out.println("Area of circle:"+ getArea());
    }
    public void setRadius(float r){this.radius=r;}
    public float getRadius(){return radius;}

}
