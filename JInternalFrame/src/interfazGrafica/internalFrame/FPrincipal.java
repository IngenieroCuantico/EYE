package interfazGrafica.internalFrame;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FPrincipal extends JFrame {
	
	
	
	//creacion de variables
	private JDesktopPane panelEscritorio;
	
	
	
	//metodo constructor principal
	public static void main(String[] args) {
		
		FPrincipal frame = new FPrincipal();
			frame.setVisible(true);
		
		
	}
	
	public FPrincipal() {
		
		initGUI();
		
		FInterno1 frame1 = new FInterno1();
		
		this.panelEscritorio.add(frame1);
		
		FInterno2 frame2 = new FInterno2();
		
		this.panelEscritorio.add(frame2);
		
	}
	
	private void initGUI() {
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Principal");
		{
			
			this.panelEscritorio = new JDesktopPane();
			getContentPane().add(panelEscritorio);
		}
		
		setSize(400, 300);
	}

}
