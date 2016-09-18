import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Message extends Actor
{
    GreenfootImage image;
    public void act() 
    {
       
    }
    
    Message()
    {
        image= this.getImage();
        setImage(image);
    }
    
    public void setMessage(String message)
    {
        image.setColor( java.awt.Color.BLACK );
        image.drawString(message,25, 50);
    }
}
