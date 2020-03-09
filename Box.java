package com.company;


  class Box extends Shape{
    float w, h;
    public Box(float W, float H)
    {
        this.w=W;
        this.h=H;
    }
    public float getArea()
    {
        return w*h;
    }
    public void display()
    {
        System.out.println("Area Box = "+getArea());
    }
    public float getW(){return w;}
    public float getH(){return h;}
    public void setW(float W){this.w=W;}
    public void setH(float H){this.h=H;}
}
