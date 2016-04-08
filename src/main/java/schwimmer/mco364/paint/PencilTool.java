package schwimmer.mco364.paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class PencilTool extends Tool {
	
	private int x;
	private int y;
	
	public PencilTool(
			CanvasRepaintManager manager,
			PaintProperties properties) {
		super(manager, properties);
	}

	public void mousePressed(Graphics2D g, int x, int y) {
		g.setColor(properties.getColor());
		g.setStroke(properties.getStroke());
		g.fillOval(x, y, 1, 1);
		repaintManager.repaint(x, y, x+1, y+1);
		this.x = x;
		this.y = y;
	}

	public void mouseReleased(Graphics2D g, int x, int y) {
		
	}

	public void mouseDragged(Graphics2D g, int x, int y) {
		g.setColor(properties.getColor());
		g.setStroke(properties.getStroke());
		g.drawLine(this.x, this.y, x, y);
		repaintManager.repaint(x, y, this.x, this.y);
		this.x = x;
		this.y = y;
	}

	public void drawPreview(Graphics2D g) {
		
	}

}
