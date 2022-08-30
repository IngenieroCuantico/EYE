package interfazGrafica.internalFrame;

import javax.swing.JInternalFrame;

public class FInterno1 extends JInternalFrame{
	
	
	public FInterno1() {
		
		initGUI();
	}

	private void initGUI() {
		
		setSize(200,100);
		setVisible(true);
		setTitle("Frame Interno 1");
	}
}
