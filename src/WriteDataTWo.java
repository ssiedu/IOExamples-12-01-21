
import java.io.FileOutputStream;

public class WriteDataTWo {
     public static void main(String[] args) throws Exception {
        
        FileOutputStream fos=new FileOutputStream("g:/data/info.txt");
        //step-2        (write the data on stream)
        String str="this data we are going to write to a file using output stream";
        byte b[]=str.getBytes();
        fos.write(b);
        
        
        //step-3        (close stream)
            fos.close();
            
            System.out.println("Data Stored....");
    }
}
