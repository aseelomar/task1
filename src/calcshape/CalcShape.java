
package calcshape;


import java.util.Scanner;


public class CalcShape{

    

     public static void main(String []args){
         
         Scanner scanner = new Scanner(System.in);
         
        System.out.println("Select the shape\n\t1- Circle\n\t2-Square\n\t3-Triangle\n\t4-Rectangle\nShape: ");
    
        
        int shapeID = Integer.parseInt(scanner.next());
        
    
        System.out.println("\n\t1- Area\n\t2-Circumference\nType: ");
        int calcType = Integer.parseInt(scanner.next());
    
        switch (shapeID) {
            case 1:
                circle(calcType);
                break;
            case 2:
                square(calcType);
                break;
                
            case 3:
                triangle(calcType);
                break;
                
            case 4:
                rectangle(calcType);
                break;
                
            default:
                break;
        }
    
        return 0;
     }
     
     private static double askForInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
     
     public static void circle(int calculationType)
     {
         
         Scanner scanner = new Scanner(System.in);
         
         
        double radius = askForInput(scanner, "Enter radius of circle:\n ");
        Circle circle = new Circle(radius);
        
        if(calculationType == 1)
            
            circle.getArea();
        else
            circle.getCircumference();
    }
    
    
    public static void square(int calculationType)
    {
        
        Scanner scanner = new Scanner(System.in);
        
        double length = askForInput(scanner, "Enter length of square\n: ");
        
        Square square = new Square(length);
        
        if(calculationType == 1)
            square.getArea();
        else
            square.getCircumference();
    }
    
    
    
    public static void rectangle(int calculationType)
    {
        
        Scanner scanner = new Scanner(System.in);
        
        double width = askForInput(scanner, "Enter width of rectangle\n: ");
        
        double height = askForInput(scanner, "Enter height of rectangle\n: ");
        
        Rectangle rectangle = new Rectangle(height, width);
        
        if(calculationType == 1)
            rectangle.getArea();
        else
            rectangle.getCircumference();
    }
    
    
    public static void triangle(int calculationType)
    {
        
        Scanner scanner = new Scanner(System.in);
        
        double base_length = askForInput(scanner, "Enter base length of triangle\n: ");
        
        double height = askForInput(scanner, "Enter height of rectangle\n: ");
        
        double side_height = askForInput(scanner, "Enter side height of triangle\n: ");
        
        Triangle triangle = new Triangle(base_length, height, side_height);
        
        if(calculationType == 1)
            triangle.getArea();
        else
            triangle.getCircumference();
    }
    
    
    

}




