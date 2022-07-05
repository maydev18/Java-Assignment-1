import P1.Shape;
import P2.Rectangle;
import P3.Circle;
public class Main {
    public static void main(String args[]){
        Shape ob1 = new Rectangle();
        ob1.read();
        ob1.area();
        Shape ob2 = new Circle();
        ob2.read();
        ob2.area();
    }
}
