
import java.io.DataInputStream;
import java.io.FileInputStream;


public class DataInputExample {
    public static void main(String[] args) throws Exception {
        //here we will read premitive values from file stud.txt
        
        FileInputStream fis=new FileInputStream("g:/data/stud.txt");
        DataInputStream dis=new DataInputStream(fis);
        int v1=dis.readInt();
        double v2=dis.readDouble();
        boolean v3=dis.readBoolean();
        
        dis.close();
        fis.close();
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        
        
    }
}
