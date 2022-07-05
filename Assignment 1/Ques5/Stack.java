import java.lang.reflect.Array;
import java.util.Scanner;
public class Stack {
    int array[];
    int tos = -1;
    int size;
    Stack(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of stack: ");
        size = scn.nextInt();
        array = new int[size];
    }
    int pop(){
        try{
            if((tos - 1) == -2) throw new ArrayIndexOutOfBoundsException();
            return array[tos--];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
            return -1;
        }
    }
    void push(int num){
        try{
            if((tos + 1)  == size) throw new ArrayIndexOutOfBoundsException();
            array[++tos] = num;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }
    void display(){
        for(int i=0 ; i<=tos ; i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(1);
        s.push(2);
        s.push(7);
        s.push(8);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
//        s.display();
    }
}
