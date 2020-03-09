package com.company;

import java.util.ArrayList;

public class ComplexShape {
  private ArrayList<Shape> shapes= new ArrayList<>();
   public void addShape(Shape inShape)
   {
       shapes.add(inShape);
   }
   public float getArea()
   {
       float tot=0;
       for (Shape cur: shapes
            ) {
           tot+=cur.getArea();
       }
       return tot;
   }
   public  void  display()
   {
       for (Shape cur:shapes
            ) {
           cur.display();
       }
   }
}
