package schwimmer.mco364.paint;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PaintFrame extends JFrame {

	public PaintFrame() {
		
		setTitle("PaintFrame");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		final Canvas canvas = new Canvas();
		container.add(canvas, BorderLayout.CENTER);
		
		Container toolbar = new Container();
		toolbar.setLayout( new FlowLayout() );
		container.add(toolbar, BorderLayout.NORTH);
		
		ActionListener listener = new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				ToolButton button = (ToolButton) event.getSource();
				canvas.setTool(button.getTool());
			}
		};
		
		ToolButton buttons[] = new ToolButton[] {
				new ToolButton(new PencilTool(), "/pencil_1.png"),
				new ToolButton(new PencilTool(), "/pencil_1.png"),
				new ToolButton(new PencilTool(), "/pencil_1.png"),
				new ToolButton(new PencilTool(), "/pencil_1.png"),
				new ToolButton(new PencilTool(), "/pencil_1.png"),
		};
		
		for ( ToolButton button : buttons ) {
			toolbar.add(button);
			button.addActionListener(listener);
		}
		
		
		setVisible(true);
		
	}
	
	public static void main( String args[] ) {
		new PaintFrame();
	}
	
}
