//nombre del paquete

package interfaz.formulario;

//importando librerias
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class PBotones extends JPanel{
	//Creacion De Variables
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JButton btnLimpiar;
	
	//Metodo Constructor con metodo instanciado del initGUI
	public PBotones() {
		initGUI();
	}
	
	private void initGUI() {
		//Creacion de un Layout
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(400,100));
	
		{
			btnAceptar = new JButton();
			this.add(btnAceptar);
			btnAceptar.setText("Aceptar");
			
		}
		{
			btnCancelar = new JButton();
			this.add(btnCancelar);
			btnCancelar.setText("Cancelar");
			
			
		}
		{
			btnLimpiar = new JButton();
			this.add(btnLimpiar);
			btnCancelar.setText("Limpiar");
		}
	}
}
