package schwimmer.mco364.paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BucketTool extends Tool {

	private BufferedImage image;
	
	public BucketTool(PaintProperties properties) {
		super(properties);
	}
	
	public void mousePressed(Graphics g, int x, int y) {
		fill(x, y);
	}

	private void fill(int x, int y) {
		Queue<Point> queue = new LinkedList<Point>();
		
		int source = image.getRGB(x, y);
		int target = properties.getColor().getRGB();
		
		queue.add(new Point(x,y));
		while ( !queue.isEmpty() ) {
			Point p = queue.remove();
			int x2 = p.getX();
			int y2 = p.getY();
			
			if ( 	x2 < 0 || 
					y2 < 0 || 
					x2 > properties.getWidth() || 
					y2 > properties.getHeight() ) {
				continue;
			}
			
			int color = image.getRGB(x2, y2);
			if ( color == source ) {
				image.setRGB(x2, y2, target);
				queue.add( new Point(x2, y2-1) );
				queue.add( new Point(x2, y2+1) );
				queue.add( new Point(x2+1, y2) );
				queue.add( new Point(x2-1, y2) );
			}
		}
	}

	public void mouseReleased(Graphics g, int x, int y) {

	}

	public void mouseDragged(Graphics g, int x, int y) {

	}

	public void drawPreview(Graphics g) {

	}

}
