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
 class Triangle implements Shape
{
    private final double base_length ;
    private final double height;
    private final double side_height;

    
    public Triangle(double base_length, double height, double side_height)
    {
        this.base_length = base_length;
        this.height = height;
        this.side_height = side_height;
    }
    
    public void getArea()
    {
        double area = ( base_length * height) / 2 ;
         System.out.println("Area of triangle :\n"+ area);
    }
    
    public void getCircumference()
    {
        double circumference = height + base_length + side_height;
         System.out.println("Circumference of triangle :\n"+ circumference);
    }
}
