package drawingTool;

import java.awt.Color;


public class Eye { 
	private static final int PUPIL_POSITION = 30;
	private static final int EYE_GAP_FACTOR = 40;
	private int width;
	private int height;
    private Pupil pupil;
    private int gap;

    public Eye(int Width, int Height) {
    	this.width = Width;
        this.height = Height; 
        this.gap = Width / EYE_GAP_FACTOR;
        //int eyeYPosition = faceHeight / 2 - this.height / 2;
        int pupilWidth = width * 2 - height;
        int pupilHeight = height - PUPIL_POSITION;
        this.pupil = new Pupil(pupilWidth, pupilHeight);// you need to make the magic values a constant 
	}
    
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

	void drawAt( int left, int bottom) {//methods
        // eye position 
		
		int leftEye = left -(width + gap);
		int rightEye = left + gap;
		
		//draw left eye 
		Drawing.pen().setColor(Color.BLACK);
		Drawing.pen().drawOval(leftEye + (width / 5), bottom - (height / 2), width, height );
    	Drawing.pen().setColor(Color.red);
    	Drawing.pen().fillOval(leftEye + (width / 5), bottom - (height / 2), width, height);
    	
    	// draw right eye 
    	Drawing.pen().setColor(Color.BLACK);
		Drawing.pen().drawOval(rightEye + (width / 2), bottom - (height / 2), width, height );
    	Drawing.pen().setColor(Color.blue);
    	Drawing.pen().fillOval(rightEye + (width / 2), bottom - (height / 2), width, height);
    	
         // Draw the pupil in the center of the eye
        pupil.drawAt((left + width / 2) - pupil.getWidth() / 2, (bottom +height/2) - pupil.getHeight() / 2);
        
       
    }

	
	
}
