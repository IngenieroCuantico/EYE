package interfaz.formulario;

import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.JFrame;


public class FFormulario extends JFrame{
	
	private JLabel labelTitulo;
	private PDatosBasicos panelDatosBasicos;
	private PDatosContacto panelDatosContacto;
	private PDatosUbicacion panelDatosUbicacion;
	private PPasatiempos panelPasatiempos;
	private PBotones panelBotones;
	private JTabbedPane panelPestañas;
	
	
	
	
	public static void main ( String[] args) {
		FFormulario MarcoFrame = new FFormulario();
		MarcoFrame.setVisible(true);
		
		
	}
	
	public FFormulario() {
		
		initGUI();
		labelTitulo = new JLabel();
		labelTitulo.setText("Formulario Usuario");
		labelTitulo.setHorizontalAlignment(JLabel.CENTER);
		panelDatosBasicos = new PDatosBasicos();
		panelDatosContacto = new PDatosContacto();
		panelDatosUbicacion = new PDatosUbicacion();
		panelPasatiempos = new PPasatiempos();
		panelBotones = new PBotones();
		panelPestañas = new JTabbedPane();
		
		getContentPane().add(labelTitulo,BorderLayout.NORTH);
		getContentPane().add(panelPestañas, BorderLayout.CENTER);
		
		{
			panelPestañas.addTab("Datos Basicos", panelDatosBasicos);
			panelPestañas.addTab("Datos Contacto",panelDatosContacto);
			panelPestañas.addTab("Datos Ubicacion",panelDatosUbicacion);
			panelPestañas.addTab("Pasatiempos",panelPasatiempos);
					
		}
		getContentPane().add(panelBotones, BorderLayout.SOUTH);
		
		
		
		
	}
	
	private void initGUI() {
		setDefaultCloseOperation(
				WindowConstants.DISPOSE_ON_CLOSE);
				setLayout(new BorderLayout());
				setTitle("Formulario CRUD");
				setSize(400,300);

	}
		
		
}


