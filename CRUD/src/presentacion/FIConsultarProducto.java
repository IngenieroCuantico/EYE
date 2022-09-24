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

public class FIConsultarProducto extends JInternalFrame {
	
	private JLabel labelNombre;
	private JTextField textNombre;
	
	private JLabel labelCantidad;
	
	
	private JButton buttonActualizar;
	private JButton buttonConsultar;
	
	private JTextField textPrecio;
	private JLabel labelPrecio;
	
	private JTextField textCantidad;
	private JTextField textId;
	
	private JLabel labelId;
	
	public FIConsultarProducto() {
		
		initGUI();
	}
	
	private void initGUI() {
		
		setTitle("Consultar Producto SISTEMA EYE");
		
		setVisible(true);
		 
		setClosable(true);
		
		getContentPane().setLayout(new GridLayout(5,2,0,0));
		
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
			
			buttonConsultar = new JButton();
			//Adiciona al contenido del pane el boton
			getContentPane().add(buttonConsultar);
			//Coloca el nombre
			buttonConsultar.setText("Consultar");
			
			//Metodo del evento del boton consultar
			buttonConsultar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent evt) {
					
					buttonConsultarActionPerformed(evt);
				}
			});
		}

			
		{
			buttonActualizar = new JButton();
			
			getContentPane().add(buttonActualizar);
			
			buttonActualizar.setText("Actualizar");
			
			//Metodo del evento del boton actualizar
			buttonActualizar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent evt) {
					
					buttonActualizarActionPerformed(evt);
					
				}
				
			});
			
		}
		setSize(350,200);
	
	}
	
	
	
	private void buttonConsultarActionPerformed(ActionEvent evt) {
		
		//Producto producto = new Producto(Integer.parseInt(this.textId.getText(), this.textNombre.getText(),Integer.parseInt(this.textCantidad.getText()),Long.parseLong(this.textPrecio.getText()));
		
		//JOptionPane.showMessageFialog(this,producto.agregar(buttonActualizarActionPerformed(evt);
		
		Producto Objproducto = new Producto(Integer.parseInt(this.textId.getText()));
		
		
		if(Objproducto.consultar()) {
			
			this.textNombre.setText(Objproducto.getNombre());
			
			this.textCantidad.setText(String.valueOf(Objproducto.getCantidad()));
			
			this.textPrecio.setText(String.valueOf(Objproducto.getPrecio()));
			
		}else {
			
			//Mensaje al no en contrar resultados
			
			JOptionPane.showMessageDialog(this, "No Existen Resultados","Consultar",JOptionPane.INFORMATION_MESSAGE);
		}
		
				
	}
	
	private void buttonActualizarActionPerformed (ActionEvent evt) {
		
		Producto producto = new Producto(Integer.parseInt(this.textId.getText()),this.textNombre.getText(),Integer.parseInt(this.textCantidad.getText()),Long.parseLong(this.textPrecio.getText()));
		
		JOptionPane.showMessageDialog(this,producto.actualizar(),"Actualizar", JOptionPane.INFORMATION_MESSAGE);
		
		
		textId.setText("");
		textNombre.setText("");
		textCantidad.setText("");
		textPrecio.setText("");
		
	}
	
	}
	
	
