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
 class Rectangle implements Shape
{
    private final double height;
    private final double width;

    
    public Rectangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }
    @Override
    public void getArea()
    {
        double area = height * width;
         System.out.println("Area of rectangle :\n"+ area);
    }
    
    public void getCircumference()
    {
        double circumference =  2 * (height + width);
         System.out.println("Circumference of rectangle :\n"+ circumference);
    }
}

