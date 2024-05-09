package drawingTool;
import java.awt.*;

public class Texture {
    private Color color; // Color of the Texture
    private int width;  // Width of the Texture
    private int height; // Height of the Texture

    public Texture(Color color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public void drawAt(Graphics pen, int left, int bottom) {
        // Draw the Texture as an oval
        pen.setColor(color); // Set the color of the Texture
        pen.fillOval(left, bottom, width, height); // Draw the filled oval
    }
}
