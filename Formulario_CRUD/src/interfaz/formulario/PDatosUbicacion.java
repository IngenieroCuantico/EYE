package interfaz.formulario;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PDatosUbicacion extends JPanel{
	
	private JLabel labelDireccion;
	private JTextField textDireccion;
	private JComboBox comboPais;
	private JLabel labelPais;
	private JLabel labelDepartamento;
	private JLabel labelCiudad;
	private JComboBox comboCiudad;
	private JComboBox comboDepartamento;
	
	public PDatosUbicacion() {
		
		initGUI();
	}

	private void initGUI() {
		
		setLayout(new GridLayout(4,2,5,5));
		
		{
			labelDireccion = new JLabel();
			this.add(labelDireccion);
			labelDireccion.setText("Direccion");
			
			
		}
		{
			textDireccion = new JTextField();
			this.add(textDireccion);
		}
		
		{
			labelPais = new JLabel();
			this.add(labelPais);
			labelPais.setText("Pais");
			
			
		}
		{
			ComboBoxModel combopaismodel = new DefaultComboBoxModel(
					
					new String[] {"Colombia ","Peru","Venezuela","Costa Rica","USA"});
			comboPais = new JComboBox();
			this.add(comboPais);
			comboPais.setModel(combopaismodel);
			
		}
		{
			labelDepartamento = new JLabel();
			this.add(labelDepartamento);
			labelPais.setText("Departamento");
			
			
		}
		{
			ComboBoxModel combodepartamentomodel = new DefaultComboBoxModel(
					
					new String[] {"Tolima ","Cundinamarca","Antioquia","Valle Del Cauca"});
			comboDepartamento = new JComboBox();
			this.add(comboDepartamento);
			comboDepartamento.setModel(combodepartamentomodel);
			
		}
		
		{
			labelCiudad = new JLabel();
			this.add(labelCiudad);
			labelPais.setText("Ciudad");
			
			
		}
		{
			ComboBoxModel combociudadmodel = new DefaultComboBoxModel(
					
					new String[] {"Ibague ","Bogota","Medellin","Cali"});
			comboCiudad = new JComboBox();
			this.add(comboCiudad);
			comboCiudad.setModel(combociudadmodel);
			
		}
		
	}
}
