import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    private boolean isCoinReceived;
    private Coin coin;
    public GumballMachine()
    {
        isCoinReceived=false;
        coin=null;
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        Coin tempCoin=null;
        if(tempCoin==null)
        {
            tempCoin=(Coin)getOneObjectAtOffset(+7, -7, Coin.class);
        }
        
        if(tempCoin!=null&&Greenfoot.mouseDragEnded(tempCoin))
        {
            getWorld().removeObject(tempCoin);
            Greenfoot.playSound("coin.wav");
            printMessage("Coin Received!\nTurn crank now",this);
            isCoinReceived=true;
            coin=tempCoin;
            tempCoin=null;
        }
        
        if(isCoinReceived)
        {
            if(Greenfoot.mouseClicked(this))
            {
               printMessage("Crank turned",this);
               GumballWorld world = (GumballWorld)getWorld(); 
               Inspector inspector = world.getInspector();
               if(inspector.checkCoin(coin))
               {
                   Picker picker = inspector.assignGumballPicker();
                   Gumball gumball = picker.pickGumball();
                   world.addObject(gumball, picker.getX(),picker.getY());
                   printMessage("You got \n"+gumball.toString(),picker);
                   Greenfoot.delay(40);
                   world.removeObject(gumball);
               }
               isCoinReceived=false; 
            }
            
        }
    }    
    
    private void printMessage(String messageText,Actor actor)
    {
         Message message = new Message();
         message.setMessage(messageText);
         getWorld().addObject(message,actor.getX()+75,actor.getY()-80);
         Greenfoot.delay(40);
         getWorld().removeObject(message);
    }
}
