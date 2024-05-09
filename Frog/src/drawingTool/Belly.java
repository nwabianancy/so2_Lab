package drawingTool;

import java.awt.Color;


public class Belly {
    private Color color; // Color of the belly
    private int width;  // Width of the belly
    private int height; // Height of the belly

    public Belly(int width, int height,Color color) {
        this.color = Color.BLUE;
        this.width = (width/2); // Example width
        this.height = height/2; // Example height
    }

    public void drawAt( int left, int bottom) {
        // Draw the belly as an oval
    	Drawing.pen().setColor(color); // Set the color of the belly
    	Drawing.pen().fillOval(left, bottom-100, width, height); // Draw the filled oval
    }

	

	public void setColor(Color color) {
		this.color = color;
		}

	}