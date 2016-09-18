import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballWorld extends World
{

    private Inspector inspector;
    private RandomPicker randomPicker;
    private GreenPicker greenPicker;
    /**
     * Constructor for objects of class GumballWorld.
     * 
     */
    public GumballWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        GumballMachine gumballmachine = new GumballMachine();
        addObject(gumballmachine, 367, 237);
        addObject( new Penny(), 57, 71 ) ;
        addObject( new Quarter(), 68, 156 ) ;
        addObject( new Quarter(), 68, 348 ) ;
        addObject( new Quarter(), 68, 440 ) ;
        addObject( new FakeQuarter(), 66, 248 ) ;

        inspector = new Inspector();
        addObject(inspector, 533, 291);
        randomPicker = new RandomPicker();
        addObject(randomPicker, 643, 104);
        randomPicker.setLocation(720, 140);
        greenPicker = new GreenPicker();
        addObject(greenPicker, 686, 454);
        greenPicker.setLocation(720, 436);
    }
    
    public Inspector getInspector()
    {
        return this.inspector;
    }
    
    public RandomPicker getRandomPicker()
    {
        return this.randomPicker;
    }
    
    public GreenPicker getGreenPicker()
    {
        return this.greenPicker;
    }
}
