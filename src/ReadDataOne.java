
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


//here we will read the contents of the file trial.txt from g:\data
public class ReadDataOne {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //to read the data from a file 
        //step-1    (open a stream (pipe-line) between file an java program)
            FileInputStream fis=new FileInputStream("g:/data/sample.txt");
        //step-2    (read the data from stream)

        while(true){
            int n=fis.read();
            if(n==-1)break;
            System.out.print((char)n);
        }
        System.out.println(); 
        //step-3    (close the stream)
            fis.close();
    }
}
