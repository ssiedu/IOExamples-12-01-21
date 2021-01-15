
import java.io.FileWriter;


public class WriterExample {

    public static void main(String[] args) throws Exception {
        //we will use methods from Writer (parent most class for text based output stream)
        //FileWriter is the child of Writer class (specially designed for writing textual data)
        
        FileWriter fw=new FileWriter("g:/data/demo.txt");
        String str="some data we writing using writer class";
        //fw.write(str);
        fw.write(str, 5, 20);
        fw.close();
        System.out.println("Data Stored...");
        
        
        
    }
}
