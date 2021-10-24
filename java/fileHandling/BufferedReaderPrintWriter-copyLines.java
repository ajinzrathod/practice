import java.io.BufferedReader;
import java.io.PrintWriter;

import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;


class A{
    public static void main(String[] args) throws Exception{
        BufferedReader bReader = null;
        PrintWriter pWriter = null;

        try{
            FileReader f1 = new FileReader("1.txt");
            FileWriter f2 = new FileWriter("2.txt");
            bReader = new BufferedReader(f1);
            pWriter = new PrintWriter(f2);

            String line;
            while((line = bReader.readLine()) != null)
                pWriter.println(line);
        }
        finally{
            if (bReader != null)
                bReader.close();
            if (pWriter != null)
                pWriter.close();
        }
    }
}
