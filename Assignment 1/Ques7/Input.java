import java.io.*;
public class Input {
    static void read(String s){
       try(
           BufferedReader bf = new BufferedReader(new FileReader(s))){
           
               String line;
               while((line = bf.readLine()) != null){
                   if(line.charAt(0) == '/' && line.charAt(1) == '/')
                   System.out.println(line);
           	}
          
 

       }
       catch(IOException ob){
           System.out.println(ob);
           return;
       }
    }
    public static void main(String args[]){
        if(args.length==0) {
            System.out.println("Please enter  a file name");
            return;
        }
        read(args[0]);
    }
}
