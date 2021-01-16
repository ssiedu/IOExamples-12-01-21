
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class PlayGame {
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Mode : (0-New, 1-Resume)");
        int mode=sc.nextInt();
        System.out.println("Enter X Move : ");
        int x=sc.nextInt();
        System.out.println("Enter Y Move : ");
        int y=sc.nextInt();
        
        Game g=null;            //declaring a reference of type Game
        if(mode==0){    //new-game
            g=new Game();   //xPos=0,yPos=0
        }else{          //resume-prev-game
            //we will read the last object from file (Which we will save while exit)
            FileInputStream fis=new FileInputStream("g:/data/gaming.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            g=(Game) ois.readObject();
            ois.close();
            fis.close();
        }
        
        g.moveH(x);
        g.moveV(y);
        g.show();
        //before exit we should save the game object, so that it can be read if user wants to resume
        //to save an object we will use ObjectOutputStream
        FileOutputStream fos=new FileOutputStream("g:/data/gaming.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(g); //when we save an object (its all members will be automatically saved)
        oos.close();
        fos.close();
        System.out.println("Game Saved.........!!");
        System.out.println("Exiting............!!");
     
    }
}
