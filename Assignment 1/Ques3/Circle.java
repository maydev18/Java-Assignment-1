package P3;
import P1.Shape;
import java.util.Scanner;
public class Circle extends Shape{
    public void read(){
        System.out.println("enter the radius: ");
        Scanner scn = new Scanner(System.in);
        r = scn.nextInt();
    }
    public void area(){
        System.out.println("The area of circle is: ");
        System.out.println(3.14*r*r);
    }
}
