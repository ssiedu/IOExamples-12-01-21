
import java.io.FileOutputStream;


public class WriteDataOne {

    public static void main(String[] args) throws Exception {
        
        //here we are writing some data to a file
        
        //step-1        (open a stream)
            //FileOutputStream fos=new FileOutputStream("g:/data/info.txt");
            //if you want to append (adding at the end) the data to an existing file use 2 arg constructor and pass true in 2nd parameter
            FileOutputStream fos=new FileOutputStream("g:/data/info.txt",true);
        //step-2        (write the data on stream)
            //fos.write(97); fos.write(98); fos.write(99); fos.write(100);
            //fos.write(65); fos.write(66); fos.write(67);
            fos.write(68); fos.write(69); fos.write(70); fos.write(71);
        //step-3        (close stream)
            fos.close();
            
            System.out.println("Data Stored....");
    }
}
