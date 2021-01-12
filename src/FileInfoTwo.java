
import java.io.File;

public class FileInfoTwo {

    public static void main(String[] args) {

        File f = new File("g:/data");

        if (f.isDirectory()) {
            String s[] = f.list();
            for (String item : s) {
                System.out.println(item);
            }
        }else{
            System.out.println("Its Not A File / Does not Exists");
        }

    }
}
/*
    String[] list()     //works on a folder and returns the elements available in the given folder)

 */
