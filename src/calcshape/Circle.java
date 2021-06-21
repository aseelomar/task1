/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcshape;


/**
 *
 * @author lenovo
 */
class Circle implements Shape
{
      
     
    private final double radius;
    private double PI = 3.141;
    
    public Circle (double radius)
    {
        this.radius = radius;
    }
   @Override
    public  void getArea()
    {
        double area =  PI * radius * radius;
          System.out.println("Area of circle : \n"+ area);
    }

    public void getCircumference()
    {
        double circumference =  2 * PI * radius;
         System.out.println("Circumference of circle \n"+ circumference);
    }

    
}
