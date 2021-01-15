import java.io.FileReader;


public class ReaderExample {

    public static void main(String[] args) throws Exception {
        //we will use methods from Reader (parent most class for text based input stream)
        //FileReader is the child of Reader class (specially designed for reading textual data from a file)
        
        FileReader fr=new FileReader("g:/data/demo.txt");
        char ch[]=new char[30];
        fr.read(ch);
        String str=new String(ch);
        System.out.println(str);
        fr.close();
        
    }
}
