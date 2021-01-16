
import java.io.Serializable;

public class Game implements Serializable {
    private int xPos, yPos;
    
    public void moveH(int pts){ //we can move a character horizentally (xPos+)
        xPos=xPos+pts;
    }
    public void moveV(int pts){ //we can move a character vertically (yPos+)
        yPos=yPos+pts;
    }
    public void show(){  //show the current-pos of character
        System.out.println("x-pos : "+xPos+", y-pos : "+yPos);
    }
}
