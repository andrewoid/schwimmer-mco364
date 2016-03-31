package schwimmer.mco364.paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.image.BufferedImage;

import com.google.inject.Singleton;

@Singleton
public class PaintProperties {

	private int width;
	private int height;
	private BufferedImage image;
	private Color color;
	private BasicStroke stroke;
	private boolean fill;
	
	public PaintProperties() {
		this.width = 800;
		this.height = 600;
		image = new BufferedImage(this.width, this.height, 
				BufferedImage.TYPE_INT_ARGB);
		this.color = Color.BLACK;
		this.stroke = new BasicStroke(6);
		this.fill = false;
	}
	
	public PaintProperties(int width, int height, BufferedImage image, Color color, int weight, boolean fill) {
		this.width = width;
		this.height = height;
		this.image = image;
		this.color = color;
		this.stroke = new BasicStroke(weight);
		this.fill = fill;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Stroke getStroke() {
		return stroke;
	}
	public void setWeight(int weight) {
		this.stroke = new BasicStroke(weight);
	}
	public boolean isFill() {
		return fill;
	}
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	
	
	
}
