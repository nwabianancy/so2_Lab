package drawingTool;
// import java.awt.Graphics2D;
import java.awt.Graphics;
//import java.awt.Color; //add color

public class Frog {
	private int width;
	private int height;
	private Face face;
	private Body body;
	//private Color color;

	public Frog (int width, int height) {
		this.width = width;
        this.height = height;
		face = new Face(width, height); // Instantiate the Face object with frog's position
		body = new Body(width, height); // Instantiate the Body object with frog's position
	}
	
	public void drawAt(Graphics pen, int left, int bottom) { 
        // Draw the body
		//Drawing.pen().setColor(Color.black);
		//Drawing.pen().fillOval(left, bottom, width, height);
        body.drawAt( left, bottom);
        face.drawAt( left, bottom);
    }

}