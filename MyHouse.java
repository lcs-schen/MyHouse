
/**
 * It draws a complete house on screen using individual shapes.
 *
 * @Author Sam Chen
 * @version 11th, jan, 2019 
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
   
    //ACCESS_MODIFIER TYPE NAME
    private Circle sun;
    private Triangle roof;
    private Square base;
    private Square window;
    private Square chimney;
    private Triangle grass1;
    private Triangle grass2;
    private Triangle grass3;
    private Triangle grass4;
    private Triangle grass5;
    private Triangle grass6;
    private Triangle grass7;
    private Triangle grass8;
    private Triangle grass9;
    private Triangle grass10;
    private Tree tree;
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    private Tree tree4;
    private Door door;
    
    

    /**
     * The job of a constructor is to initialize the instance variable
     */
    public MyHouse()
    {
        // initialise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
        window = new Square();
        chimney = new Square();
        grass1 = new Triangle();
        grass2 = new Triangle();
        grass3 = new Triangle();
        grass4 = new Triangle();
        grass5 = new Triangle();
        grass6 = new Triangle();
        grass7 = new Triangle();
        grass8 = new Triangle();
        grass9 = new Triangle();
        grass10 = new Triangle();
        
        // Now actually use the shapes to draw the house
        drawHouse();
        
        // Now draw trees
        tree = new Tree(210, 170);
        tree1 = new Tree(260, 170);
        tree2 = new Tree(310, 190);
        tree3 = new Tree(360, 200);
        tree4 = new Tree(2, 170);
        
        
        
        //Draw door
        door = new Door(100, 155);
    }

    /**
     * Draw the house for us.
     */
    public void drawHouse()
    {
        // Put the roof
       roof.changeSize(50, 200);
       roof.moveHorizontal(100);
       roof.moveVertical(40);
       roof.makeVisible();
       roof.changeColor("green");
       
       //Put the base
       base.changeSize(130);
       base.moveVertical(55);
       base.moveHorizontal(25);
       base.makeVisible();
       base.changeColor("yellow");
       
       //Put the window
       window.changeSize(40);
       window.moveVertical(70);
       window.moveHorizontal(35);
       window.changeColor("blue");
       window.makeVisible();
       
       //Put the sun
       sun.changeSize(100);
       sun.changeColor("yellow");
       sun.moveHorizontal(-70);
       sun.moveVertical(-100);
       sun.makeVisible();
       
       //Put the chimney
       chimney.changeSize(40);
       chimney.changeColor("green");
       chimney.moveHorizontal(110);
       chimney.moveVertical(5);
       chimney.makeVisible();
       
       //Put the grass1
       grass1.changeSize(30, 60);
       grass1.moveVertical(260);
       grass1.moveHorizontal(-10);
       grass1.makeVisible();
       
       //Put the grass2
       grass2.changeSize(30, 60);
       grass2.moveVertical(260);
       grass2.moveHorizontal(20);
       grass2.makeVisible();
       
       //Put the grass3
       grass3.changeSize(30, 60);
       grass3.moveVertical(260);
       grass3.moveHorizontal(50);
       grass3.makeVisible();
       
       //Put the grass4
       grass4.changeSize(30, 60);
       grass4.moveVertical(260);
       grass4.moveHorizontal(80);
       grass4.makeVisible();
       
       //Put the grass5
       grass5.changeSize(30, 60);
       grass5.moveVertical(260);
       grass5.moveHorizontal(110);
       grass5.makeVisible();
       
       //Put the grass6
       grass6.changeSize(30, 60);
       grass6.moveVertical(260);
       grass6.moveHorizontal(140);
       grass6.makeVisible();
       
       //Put the grass7
       grass7.changeSize(30, 60);
       grass7.moveVertical(260);
       grass7.moveHorizontal(170);
       grass7.makeVisible();
       
       //Put the grass8
       grass8.changeSize(30, 60);
       grass8.moveVertical(260);
       grass8.moveHorizontal(210);
       grass8.makeVisible();
       
       //Put the grass9
       grass9.changeSize(30, 60);
       grass9.moveVertical(260);
       grass9.moveHorizontal(240);
       grass9.makeVisible();
       
       //Put the grass10
       grass10.changeSize(30, 60);
       grass10.moveVertical(260);
       grass10.moveHorizontal(-40);
       grass10.makeVisible();
       
       
       
       
       
       
       
        
    }
}
