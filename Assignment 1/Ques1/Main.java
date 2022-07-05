class Complex{
    private int real , imag;
    Complex(){
        real = imag = 0;
    }
    Complex(int x , int y){
        real = x;
        imag = y;
    }
    Complex(Complex ob){
        real = ob.real;
        imag = ob.imag;
    }
    Complex add(Complex ob){
        int newreal = real + ob.real;
        int newimag = imag + ob.imag;
        return new Complex(newreal , newimag);
    }
    Complex multiply(Complex ob){
        int newreal = (real * ob.real) - (imag * ob.imag);
        int newimag = (real * ob.imag) + (imag * ob.real);
        return new Complex(newreal , newimag);
    }
    public String toString(){
        String s = new String();
        s+=real+"+"+imag+"i";
        return s;
    }
}
class Main{
    public static void main(String args[]){
        Complex ob1 = new Complex(3,4);
        Complex ob2 = new Complex(4,5);
        Complex res = ob1.add(ob2);
        System.out.println(res.toString());
        res = ob1.multiply(ob2);
        System.out.println(res.toString());
    }
}