import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class CreateFile{
    public static void main(String[] args){
        try{
            File f1 = new File("1.txt");
            if(f1.createNewFile()){
                System.out.println("File Created");
            }
            else{
                FileWriter f2 = new FileWriter("1.txt");
                f2.write("Hello");
                f2.close();
                System.out.println("Write Success");
            }

            FileReader f3 = new FileReader("1.txt");

            int i;
            while ((i = f3.read()) != -1){
                System.out.print((char)i);
            }
            f3.close();
        }
        catch(IOException e){
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}
