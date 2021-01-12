import java.io.File;

public class FileInfo {

    public static void main(String[] args) {

        File f=new File("g:\\data\\info.txt");
        if(f.exists()){
            if(f.isFile()){
                long v=f.length();
                System.out.println(v);
            }else{
                System.out.println("Its a Folder");
            }
        }else{
            System.out.println("Doesn't Exists....");
        }
    }

}
/*
    File class methods (non-static)
    --------------------------------
    
    long length()           //size of the file
    boolean exists()        //checks the existence of a file/folder return true if file/folder exists
    boolean isFile()        //return true if the path belongs to a file (if its directory or not exists returns false)
    boolean isDirectory()   //return true if the path belongs to a directory otherwise false


 */
