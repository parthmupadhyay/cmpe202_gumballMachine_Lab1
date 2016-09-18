import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Picker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Picker extends Alien
{
    /**
     * Act - do whatever the Picker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public Gumball pickGumball()
    {
        int gumball = Greenfoot.getRandomNumber(3);
        GumballWorld world =  (GumballWorld)getWorld();
        if(gumball==0)
        {
            return new RedGumball();
        }
        else if(gumball==1)
        {
            return new BlueGumball();
        }
        else 
        {
            return new GreenGumball();
        }
    }
}
