
import java.io.File;
import java.io.IOException;


public class FileInfoFour {

    public static void main(String[] args) throws IOException {

        File f=new File("g:/data/sample.txt");
        boolean res=f.createNewFile();
        
        /*
        File toBeRenamed=new File("g:/data/info.txt");
        File newName=new File("g:/data/trial.txt");
        boolean res=toBeRenamed.renameTo(newName);
        */
        //File f=new File("g:/data/abc");
        //boolean res=f.mkdir();
        
        //boolean res=f.delete();
        
        if(res==true){
            System.out.println("Operation Success..");
        }else{
            System.out.println("Operation Failed..");
        }
        
    }
}
/*
    methods for basic file operations.

    boolean mkdir()
    boolean delete()        //delete a file or folder (only empty)
    boolean renameTo(File)  
    boolean createNewFile()

*/
