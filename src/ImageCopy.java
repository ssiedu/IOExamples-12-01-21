
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ImageCopy {
    public static void main(String[] args) throws Exception {

        //here we will read an image file and will copy its data to another file.
        
        //one stream for reading
            FileInputStream fis=new FileInputStream("e:/images/mobile.png");
        //one stream for writing
            FileOutputStream fos=new FileOutputStream("g:/data/mobilecopy.png");
        //read method to read the data from input stream and write method to write the data on output stream
            while(true){
                int n=fis.read();
                System.out.print((char)n);
                if(n==-1)break;
                fos.write(n);
            }
            System.out.println("Image Copied....");
            fis.close();
            fos.close();
            
    }
}
