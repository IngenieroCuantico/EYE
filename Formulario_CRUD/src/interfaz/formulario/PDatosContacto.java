package interfaz.formulario;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PDatosContacto extends JPanel{
	
	private JLabel labelCorreo;
	private JTextField textCorreo;

	private JLabel labelCelular;
	private JTextField textCelular;
	
	private JLabel labelTelefono;
	private JTextField textTelefono;
	
	
	public PDatosContacto() {
		
		initGUI();
	}

	private void initGUI() {
		setLayout(new GridLayout(3,2,5,5));
		setPreferredSize(new Dimension(400, 150));
		{
			labelCorreo = new JLabel();
			this.add(labelCorreo);
			labelCorreo.setText("Correo");
		}
		{
			textCorreo = new JTextField();
			this.add(textCorreo);
		}
		{
			labelTelefono = new JLabel();
			this.add(labelTelefono);
			labelTelefono.setText("Telefono");
		}
		{
			textTelefono = new JTextField();
			this.add(textTelefono);
		}
		{
			labelCelular = new JLabel();
			this.add(labelCelular);
			labelCelular.setText("Celular");
		}
		{
			textCelular = new JTextField();
			this.add(textCelular);
		}
		
	}
}
