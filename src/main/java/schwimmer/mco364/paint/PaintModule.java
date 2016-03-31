package schwimmer.mco364.paint;

import com.google.inject.Binder;
import com.google.inject.Module;

public class PaintModule implements Module {

	public void configure(Binder binder) {
		
		PaintProperties properties = new PaintProperties();
		
		binder.bind(PaintProperties.class).toInstance(properties);

		ToolButton buttons[] = new ToolButton[] {
		};
		
		binder.bind(ToolButton[].class).toInstance(buttons);
		
	}

}
