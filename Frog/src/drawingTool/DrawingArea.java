
package drawingTool;

import java.awt.Graphics;
//import java.awt.Polygon;


import javax.swing.JPanel;

public class DrawingArea extends JPanel {
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		Drawing.set(pen); //++
		Frog myFrog = new Frog(200, 200); //size
		
		myFrog.drawAt(pen, 500, 300); //the position of the frog on drawing area
		/*
		pen.drawLine(100, 100, 800, 800); //the black line
		
		pen.setColor(Color.blue); // a color constant, color of the rectangle
		pen.drawRect(10, 10, 200, 300); //drawing the rectangle
	
		pen.setColor(Color.decode("#7a5230")); // HEX representation, brown color inside a circle
		pen.fillOval(300, 234, 800, 100); //drawing the oval
		
		pen.setColor(new Color(255,100,100)); // RGB representation, color font red
		pen.drawString("Hello World", 666, 280); //the line inside the circle
	*/
	}
}