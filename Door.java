
/**
 * Creates an instance of a Door.
 *
 * @author C. Sam
 * @version January 17, 2019
 */
public class Door
{
    //variables - replace the example below with your own
    
    private Square door1;
    private Circle door2;
    
    

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Door(int x, int y)
    {
        // initialise instance variables
        door1 = new Square();
        door2 = new Circle();
        
        // actually draw the door
        drawDoor(x, y);
    }

    /**
     * Draws the door
     *
     * @param x     the horizontal position of the Door
     * @param y     the vertical position of the Door
     */
    public void drawDoor(int x, int y)
    {
        //Put the door2
        door2.changeSize(30);
        door2.moveHorizontal(x+40);
        door2.moveVertical(y-30);
        door2.makeVisible();
        door2.changeColor("blue");
        
        //Put the door1
        door1.makeVisible();
        door1.changeColor("blue");
        door1.moveHorizontal(x);
        door1.moveVertical(y);
        
        
        
        
        
        
        
       
        
    }
    
}
