package schwimmer.mco364.paint;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class PaintToolbar extends Container {

	@Inject
	public PaintToolbar(final Canvas canvas,
			ToolButton buttons[]) {
		
		setLayout( new FlowLayout() );
		
		ActionListener listener = new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				ToolButton button = (ToolButton) event.getSource();
				canvas.setTool(button.getTool());
			}
		};
		
		for ( ToolButton button : buttons ) {
			add(button);
			button.addActionListener(listener);
		}
		
	}
	
}
