package p1;
public class TwoDim{
    private int x,y;
    public TwoDim(){
        x = -1;
        y = -1;
    }
    public TwoDim(int x, int y){
        this.x = x;
        this.y = y;
    }
    public TwoDim(TwoDim obj){
        this.x = obj.x;
        this.y = obj.y;
    }
    public String toString(){
        String s = "the value of x is: " + x + " the value of y is : " + y;
        return s;
    }
    public int getx(){return x;}
    public int gety(){return y;}
}
