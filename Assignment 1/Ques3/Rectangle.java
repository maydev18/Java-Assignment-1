package P2;
import P1.Shape;
import java.util.Scanner;
public class Rectangle extends Shape{
    public void read(){
        System.out.println("enter length: ");
        Scanner scn = new Scanner(System.in);
        x = scn.nextInt();
        System.out.println("enter breadth: ");
        y = scn.nextInt();
    }
    public  void area(){
        System.out.println("The area is : " + (x*y));
    }
}
