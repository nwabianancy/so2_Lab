package drawingTool;
 
import java.awt.Color;
import java.awt.Graphics;
 
 
public class Mouth {
    private Color color;
 
    public Mouth(Color color) {
        this.color = color;
    }
 
    public void drawAt(Graphics pen, int left, int bottom) {
        pen.setColor(color);
        pen.drawArc(640,250,100,100,0,-180);// Draw the smile as a half circle
    }
}