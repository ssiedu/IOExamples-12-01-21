
import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class DataOutputExample {
    public static void main(String[] args) throws Exception {
        //suppose we need to write some premitive data to file
        int rno=1001; 
        double per=96.55;
        boolean meritHolder=true;
        
        FileOutputStream fos=new FileOutputStream("g:/data/stud.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(rno);
        dos.writeDouble(per);
        dos.writeBoolean(meritHolder);
        
        dos.close(); fos.close();
        
        System.out.println("Data Stored....");
    }
}
