GumballMachine gumballMachine;
void setup() 
{
  size(700, 700) ;
  background(255) ;
  smooth() ;
  strokeWeight(3);
  strokeCap(ROUND);
  gumballMachine = new GumballMachine(5);
  PFont font;
  font = loadFont("BookAntiqua-48.vlw");
  textFont(font, 16);

}

void draw() {
  fill(0);  
  text("The Gumball Machine", 250, 60);
  PImage image = loadImage("gumball.jpg");
  image(image, (width-image.width)/2, (height-image.height)/2); 
  Button insertQuarterButton=new Button(130,625,120,40);
  if(insertQuarterButton.isMouseOver())
  {
     if(mousePressed)
     {
        insertQuarterButton.changeButtonColor(0);
        gumballMachine.insertQuarter();
     }
  }
  insertQuarterButton.drawButton();
  Button turnCrankButton=new Button(430,625,120,40);
  if(turnCrankButton.isMouseOver())
  {
     if(mousePressed)
     {
        turnCrankButton.changeButtonColor(0);
        gumballMachine.turnCrank();
     }
  }
  turnCrankButton.drawButton();
  drawGumballMachineStatus(new Button(550,350,120,60));
  fill(0);
  stroke(0);
  text("Insert Quarter",140,638,120,40);
  text("Turn Crank",451,638,120,40);
  text("Gumballs left\n"+gumballMachine.getCount(),565,363,120,40);
  //runTest() ;
}


public void drawGumballMachineStatus(Button button)
{
  button.drawButton(255);
}