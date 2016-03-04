package schwimmer.mco364.paint;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class PaintProperties {

	private int width;
	private int height;
	private BufferedImage image;
	private Color color;
	private int weight;
	private boolean fill;
	
	public PaintProperties(int width, int height, BufferedImage image, Color color, int weight, boolean fill) {
		this.width = width;
		this.height = height;
		this.image = image;
		this.color = color;
		this.weight = weight;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isFill() {
		return fill;
	}
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	
	
	
}
