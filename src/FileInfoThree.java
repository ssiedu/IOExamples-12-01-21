
import java.io.File;
import java.util.Date;

public class FileInfoThree {

    public static void main(String[] args) {

        File f=new File("g:\\data\\info.txt");
        long res=f.lastModified();  //no of milli seconds passed from 1st jan 1970 mid night
        Date dt=new Date(res);
        //boolean res=f.canWrite();
        //boolean res=f.isHidden();
        System.out.println(res);
        System.out.println(dt);
    }    
}
/*
    long lastModified() //returns the last modification data-time of the file (long format)
    boolean canWrite()  //returns true if the file is not read-only
    boolean isHidden()
*/
