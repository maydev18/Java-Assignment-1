import java.io.*;
public class Copy {
    public static void main(String args[]){
        if(args.length<2){
            System.out.println("please enter file name of 2 files");
            return;
        }
        FileInputStream source = null;
        FileOutputStream destination = null;
        try{
            source = new FileInputStream(args[0]);
            destination = new FileOutputStream(args[1]);
            try{
                int ch = source.read();
                while(ch != -1){
                    destination.write(ch);
                    ch = source.read();
                }
            }
            catch(IOException e){
                System.out.println("error occured :"+ e.toString());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("cannot get the files");
            return;
        }
        try{
            source.close();
            destination.close();
        }
        catch (IOException e){
            System.out.println("unable to close the files");
        }
    }
}
