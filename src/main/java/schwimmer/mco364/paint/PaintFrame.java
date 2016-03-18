package schwimmer.mco364.paint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.HashMap;

import javax.inject.Inject;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class PaintFrame extends JFrame {

	@Inject
	public PaintFrame(Canvas canvas, PaintToolbar toolbar) {
		
		setTitle("PaintFrame");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		container.add(canvas, BorderLayout.CENTER);
		container.add(toolbar, BorderLayout.NORTH);
		
		setVisible(true);
		
	}
	
	public static void main( String args[] ) {
	    Injector injector = Guice.createInjector(new PaintModule());
		injector.getInstance(PaintFrame.class);
	}
	
}
