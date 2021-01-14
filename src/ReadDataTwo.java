
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataTwo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //to read the data from a file 
        //step-1    (open a stream (pipe-line) between file an java program)
            FileInputStream fis=new FileInputStream("g:/data/info.txt");
        //step-2    (read the data from stream)
            int n=fis.available();  //it gives you no of bytes available for reading in stream
            System.out.println("Total Bytes Available : "+n);
            byte b[]=new byte[n];
            fis.read(b);    //will take 1st byte from stream and store to b[0], 2nd to b[1], 3rd to b[2]
            //converting bytes to String
            String st=new String(b);
            System.out.println(st);
        //step-3    (close the stream)
            fis.close();
    }
}
