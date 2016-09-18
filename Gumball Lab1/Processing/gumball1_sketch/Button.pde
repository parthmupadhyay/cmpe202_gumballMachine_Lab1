public class Button
{
  private int xCoordinate;
  private int yCoordinate;
  private int length;
  private int width;
  
  Button(int xCoordinate,int yCoordinate,int length,int width)
  {
     this.xCoordinate=xCoordinate;
     this.yCoordinate=yCoordinate;
     this.length=length;
     this.width=width;
  }
  
  public void drawButton()
  {
    rect(xCoordinate,yCoordinate,length,width); 
  }
  
  public void drawButton(int colour)
  {
     fill(colour); 
     rect(xCoordinate,yCoordinate,length,width); 
  }
  
  public void changeButtonColor(int colour)
  {
    fill(colour);
  }
  
  public int getXCoordinate()
  {
     return this.xCoordinate; 
  }
  
   public int getYCoordinate()
  {
     return this.yCoordinate; 
  }
  
   public int getLength()
  {
     return this.length; 
  }
  
   public int getWidth()
  {
     return this.width; 
  }
  
  public boolean isMouseOver()
  {
      if(mouseX >= xCoordinate && mouseX <= xCoordinate+length && mouseY >= yCoordinate && mouseY <=yCoordinate+width) 
      {
        this.changeButtonColor(96);
        return true;
      }
      else
      {
        this.changeButtonColor(255); 
        return false;
      }
  }
}