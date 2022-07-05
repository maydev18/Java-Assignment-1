package p;
import p1.TwoDim;
import p2.ThreeDim;
class Main{
    public static void main(String args[]){
        TwoDim ob = new ThreeDim(2,3,6);
        System.out.println(ob.toString());
        TwoDim ob1 , ob2;
        ob1 = new ThreeDim(2,3,4);
        ob2 = new ThreeDim(2,3,4);
        System.out.println(ob1.equals(ob2));
    }
}