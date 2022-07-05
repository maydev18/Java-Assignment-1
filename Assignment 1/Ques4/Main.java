class UnderAge extends Exception{
    public void printMessage(int age){
        System.out.println("under age " +age);
    }
}
class ExceptionDemo{
    void test(int age){
        try{
            if(age<18){
                throw new UnderAge();
            }
            else{
                System.out.println("age is greater than or equal to 18");
            }
        }
        catch(UnderAge ob){
            ob.printMessage(age);
        }
    }
}
class Main{
    public  static void main(String args[]){
        ExceptionDemo ob = new ExceptionDemo();
        ob.test(19);
    }
}