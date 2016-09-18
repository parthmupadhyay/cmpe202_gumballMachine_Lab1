import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class AlertMessage extends Message
{
    GreenfootImage image;
    public void act() 
    {
        // Add your action code here.
    }    
    
    
    AlertMessage()
    {
       image= this.getImage();
       setImage(image);
    }
    
    @Override
    public void setMessage(String message)
    {
        image.setColor( java.awt.Color.RED );
        image.drawString(message,25, 35);
    }
}
