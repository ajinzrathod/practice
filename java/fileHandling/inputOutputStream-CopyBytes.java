import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


class A{
    public static void main(String[] args) throws IOException{
        FileInputStream f1 = null;
        FileOutputStream f2 = null;

        try{
            f1 = new FileInputStream("1.txt");
            f2 = new FileOutputStream("2.txt");

            int c;
            while ((c = f1.read()) != -1){
                f2.write(c);
            }
        }
        finally{
            if(f1 != null)
                f1.close();
            if(f2 != null)
                f2.close();
        }
    }
}
