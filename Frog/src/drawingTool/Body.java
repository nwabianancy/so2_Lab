package drawingTool;

import java.awt.Color;

public class Body {
	
	private final int LEG_LOWER_OFFSET = 70; // Define a named constant for leg lower offset
    private final int LEG_LEFT_OFFSET = 20; // Define a named constant for leg left offset

	private int width;
	private int height;
	private Belly belly; 
	private Leg leftLeg;
    private Leg rightLeg;
	/*private Color color;
   
    */
 
    
    public Body(int width, int height) {
		this.width = width; 
		this.height = height; 
	    this.belly = new Belly(width,height,Color.blue);
	    this.leftLeg = new Leg(width/2, height);
	    this.rightLeg = new Leg(width/2, height);
    }

    public void drawAt( int left, int bottom) {
		// Draw the body at the specified position
    	Drawing.pen().setColor(Color.BLACK); 
    	Drawing.pen().drawOval(left, bottom - 100, width, height);
    	Drawing.pen().setColor(new Color(107, 225, 61)); //body
    	Drawing.pen().fillOval(left, bottom - 100, width, height);
		
	//Drawing.pen().drawOval(left,bottom-50, width, height);
		belly.drawAt( left, bottom - 100);
		
		// Adjusting the bottom position to lower the oval body
        int adjustedBottom = bottom * 2 - height / 2; //add 
        // Draw the Leg 
		leftLeg.drawAt(left - LEG_LEFT_OFFSET, adjustedBottom - height + LEG_LOWER_OFFSET); // Draw the left leg
        rightLeg.drawAt(left + width - LEG_LEFT_OFFSET, adjustedBottom - height + LEG_LOWER_OFFSET); // Draw the right leg
      
    }
}
    /*
    
	public static void main(String[] args) {
	        // Create a Body object with initial size
	        Body body = new Body(100, 150);

	        // Change the size of the body
	      //  body.setSize(120, 180);
	    }

	
	
	
	}
	*/
    
	
