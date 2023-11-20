import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  // Variables
  PImage imgBackground;
	PImage imgBunny;
  
  float fltBunnyX = -100;
  float fltBunnyY = 0;

  float fltBunnySpeedX = 2;
  float fltBunnySpeedY = 1;

  float fltCirX = 100;
  float fltCirY = width/10;

  float fltCirSpeedX = 2;
  float fltCirSpeedY = 1;

  float cosAngle = 0;
  float sinAngle = 0;
  float fltBunnyAngle = 0;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {

	// Size call
    size(1000, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
    // Load the images into the program
    imgBunny = loadImage("bunny.png"); 
    
    imgBunny.resize(imgBunny.width/4,imgBunny.height/4);
    background(210, 255, 173);
    
  imgBackground = loadImage("garden.jpg");

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  // Generate the background
  background(128);
  image(imgBackground, 0, 0);
{
  // Generate the bunny
   image(imgBunny, fltBunnyX, fltBunnyY);
    fltBunnyX += 1;

    // Make the bunny move in a wave motion
    fltBunnyX = (fltBunnyAngle) * 120; 
    fltBunnyY = 250 + cos(fltBunnyAngle) * 80;

    fltBunnyAngle += 0.04;

    // Reset the bunny
    if (fltBunnyAngle > 8) {
      fltBunnyAngle = -1;

  }

  // Generate the oval
  ellipse(fltCirX, fltCirY, width / 5, height / 5);

  // Move the oval
  fltCirX += fltCirSpeedX;
  fltCirY += fltCirSpeedY;

  // Edge detection for the oval
  if (fltCirX < 10 || fltCirX > width - 100) {
    fltCirSpeedX *= -1;
  }

  if (fltCirY < 10 || fltCirY > height - 80) {
    fltCirSpeedY *= -1;
{
        }
      }
    }
  }
}





