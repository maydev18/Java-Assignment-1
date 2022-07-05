package p2;
import p1.TwoDim;
public class ThreeDim extends TwoDim{
    private int z;
    public ThreeDim(){
        super();
        z = -1;
    }
    public ThreeDim(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    public ThreeDim(ThreeDim obj){
        super(obj);
        this.z = obj.z;
    }
    public String toString(){
        String s = "the value of x is: " + getx() + " the value of y is : " + gety() + " The value of z is: " + z;
        return s;
    }
    public boolean equals(Object obj){
        ThreeDim ob = (ThreeDim) obj;
        return (getx() == ob.getx() && gety() == ob.gety() && z == ob.z);
    }
}