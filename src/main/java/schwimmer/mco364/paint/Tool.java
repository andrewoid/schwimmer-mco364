package schwimmer.mco364.paint;

import java.awt.Graphics2D;

public abstract class Tool {

	protected PaintProperties properties;
	protected CanvasRepaintManager repaintManager;
	
	public Tool(CanvasRepaintManager manager, 
			PaintProperties properties) {
		this.properties = properties;
		this.repaintManager = manager;
	}
	
	abstract void mousePressed(Graphics2D g, int x, int y);
	abstract void mouseReleased(Graphics2D g, int x, int y);
	abstract void mouseDragged(Graphics2D g, int x, int y);
	abstract void drawPreview(Graphics2D g);
	
}
