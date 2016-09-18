import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    public boolean checkCoin(Coin coin)
    {   
        if(coin==null)
        {
            System.out.println("Coin is null");
        }
        boolean flag=false;
        if(coin instanceof Quarter )
        {
            Quarter quarter = (Quarter)coin;
            if(quarter.isFakeQuarter())
            {
                flag= false;
                Message message = new AlertMessage();
                message.setMessage("Its a Fake Quarter!");
                getWorld().addObject(message, getX()+65,getY()-80);
                Greenfoot.delay(40);
                getWorld().removeObject(message);
            }
            else
            {
                flag=true;
                Message message = new Message();
                message.setImage(new GreenfootImage("approved.png"));
                getWorld().addObject(message, getX()+65,getY()-80);
                Greenfoot.delay(30);
                getWorld().removeObject(message);
            }
        }
        else if(coin instanceof Penny)
        {
            flag= false;
            Message message = new AlertMessage();
            message.setMessage("Its a Penny!\nEnter Quarter");
            getWorld().addObject(message, getX()+65,getY()-80);
            Greenfoot.delay(40);
            getWorld().removeObject(message);
        }
        return flag;
    }
    
    public Picker assignGumballPicker()
    {
        int num = Greenfoot.getRandomNumber(2);
        GumballWorld world=(GumballWorld)getWorld();
        if(num==0)
        {
            return world.getGreenPicker();
        }
        else
        {
            return world.getRandomPicker();
        }
    }
}
