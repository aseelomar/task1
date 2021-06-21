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
class Square implements Shape
{
    private final double length;
    
    public Square(double length)
    {
        this.length = length;
    }
    @Override
    public void getArea()
    {
        double area = length * length;
         System.out.println("Area of square :\n"+ area);
    }
    
    public void getCircumference()
    {
        double circumference =  4 * length;
         System.out.println("Circumference of square :\n"+ circumference);
    }
}
