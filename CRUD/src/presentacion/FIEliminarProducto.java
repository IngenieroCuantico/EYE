package presentacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import logica.Producto;

public class FIEliminarProducto extends JInternalFrame {
	
	private JLabel labelNombre;
	private JTextField textNombre;
	private JLabel labelCantidad;
	
	private JTextField textPrecio;
	private JLabel labelPrecio;
	private JTextField textCantidad;
	private JTextField textId;
	private JLabel labelId;
	
	//Botones
	
	private JButton buttonLimpiar;
	private JButton buttonConsultar;
	private JButton buttonEliminar;
	private JButton buttonRegresarInicio;
	
	public FIEliminarProducto() {
		
		initGUI();
	}
	
	private void initGUI() {
		
		setTitle("Eliminar Producto Del Sistema EYE");
		setVisible(true);
		setClosable(true);
		getContentPane().setLayout(new GridLayout(6,2,0,0));
		
		{
			
			labelId = new JLabel();
			getContentPane().add(labelId);
			labelId.setText("Id");
		}
		{
			textId = new JTextField();
			getContentPane().add(textId);
			
		}
{
			
			labelNombre = new JLabel();
			getContentPane().add(labelNombre);
			labelNombre.setText("Nombre");
		}
		{
			textNombre = new JTextField();
			getContentPane().add(textNombre);
			
		}
		{
			labelCantidad = new JLabel();
			getContentPane().add(labelCantidad);
			labelCantidad.setText("Cantidad");
			
		}
		{
			textCantidad = new JTextField();
			getContentPane().add(textCantidad);
			
		}
		
		
		{
			labelPrecio = new JLabel();
			getContentPane().add(labelPrecio);
			labelPrecio.setText("Precio");
			
			
		}
		{
			textPrecio = new JTextField();
			getContentPane().add(textPrecio);
			
		}
		
		{
			buttonEliminar = new JButton();
			getContentPane().add(buttonEliminar);
			buttonEliminar.setText("Eliminar");
			buttonEliminar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent evt) {
					
					buttonEliminarActionPerformed(evt);
				}
			});
		}
			
		{
			buttonLimpiar = new JButton();
			getContentPane().add(buttonLimpiar);
			buttonLimpiar.setText("Limpiar");
			buttonLimpiar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent evt) {
					buttonLimpiarActionPerformed(evt);
				}
				
			});
			
		}
		
		{
			buttonRegresarInicio = new JButton();
			getContentPane().add(buttonRegresarInicio);
			buttonRegresarInicio.setText("Regresar");
			buttonRegresarInicio.addActionListener( new ActionListener() {
				
				public void actionPerformed(ActionEvent evt) {
					buttonRegresarInicioActionPerformed(evt);
				}
			});
			
			
		}
		{
			buttonConsultar = new JButton();
			getContentPane().add(buttonConsultar);
			buttonConsultar.setText("Consultar");
			buttonConsultar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent evt) {
					
					buttonConsultarActionPerformed(evt);
				}
			});
		}
		setSize(350,200);
	
	}
	
	
	

	
	private void buttonRegresarInicioActionPerformed(ActionEvent evt) {
		
		textId.setText("");
		textNombre.setText("");
		textCantidad.setText("");
		textPrecio.setText("");
		
	}
	
	private void buttonLimpiarActionPerformed (ActionEvent evt) {
		textId.setText("");
		textNombre.setText("");
		textCantidad.setText("");
		textPrecio.setText("");
		
	}
	
	private void buttonConsultarActionPerformed(ActionEvent evt) {
		
	//	System.out.println("Consultando....1000%%%%");
		
		Producto productoconsultadoaeliminar = new Producto(Integer.parseInt(this.textId.getText()));
		
		if(productoconsultadoaeliminar.consultar()) {
			
			this.textNombre.setText(productoconsultadoaeliminar.getNombre());
			this.textCantidad.setText(String.valueOf(productoconsultadoaeliminar.getCantidad()));
			this.textPrecio.setText(String.valueOf(productoconsultadoaeliminar.getPrecio()));
			
			
		}else {
			JOptionPane.showMessageDialog(this, "No Existe Registro Para Eliminar","Eliminar Registro De Producto",JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
	private void buttonEliminarActionPerformed(ActionEvent evt) {
		
		Producto producto = new Producto(Integer.parseInt(this.textId.getText()));
		
		JOptionPane.showMessageDialog(this,producto.eliminar());
		
		
	}
	
}
	