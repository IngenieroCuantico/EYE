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
import logica.Noticia;

public class FIAgregarUsuario extends JInternalFrame {
	
	private JTextField textId;
	private JLabel labelId;
		
	private JLabel labelTitulo;
	private JTextField textTitulo;
	
	private JLabel labelEncabezado;
	private JTextField textEncabezado;
	
	private JTextField textContenido;
	private JLabel labelContenido;
	
	
	
	//Botones 
	
	private JButton buttonLimpiar;
	private JButton buttonAgregar;
	
	
	public FIAgregarUsuario() {
		
		//Metodo instanciado Constructor de la visualizacion initGUI();....
		initGUI();
		
	}
	
	private void initGUI() {
		
		setTitle("Agregar Noticia Evidencial Al Sistema EYE");
		
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
			
			labelTitulo = new JLabel();
			
			getContentPane().add(labelTitulo);
			
			labelTitulo.setText("Titulo");
		}
		{
			textTitulo = new JTextField();
			getContentPane().add(textTitulo);
			
		}
		{
			labelEncabezado = new JLabel();
			getContentPane().add(labelEncabezado);
			labelEncabezado.setText("Encabezado");
			
		}
		{
			textEncabezado = new JTextField();
			getContentPane().add(textEncabezado);
			
		}	
		{
			labelContenido = new JLabel();
			getContentPane().add(labelContenido);
			labelContenido.setText("Contenido");
		}
		{
			textContenido = new JTextField();
			getContentPane().add(textContenido);
		}
		{
			buttonAgregar = new JButton();
			
			getContentPane().add(buttonAgregar);
			
			buttonAgregar.setText("Agregar");
			
			buttonAgregar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent evt) {
					
					buttonAgregarActionPerformed(evt);
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
		setSize(300,200);
	
	}
	
	
	//Metodos para los botones . en este caso el de AGREGAR
	
	private void buttonAgregarActionPerformed(ActionEvent evt) {
		
		//Producto producto = new Producto(Integer.parseInt(this.textId.getText()),this.textNombre.getText(),Integer.parseInt(this.textCantidad.getText()),Long.parseLong(this.textPrecio.getText()));
		
		Noticia noticia = new Noticia(Integer.parseInt(this.textId.getText()),this.textTitulo.getText(),this.textEncabezado.getText(),this.textContenido.getText());
		
		//JOptionPane.showMessageDialog(this, producto.insertar(),"Agregar",JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(this, noticia.insertar(),"Agregando Noticia",JOptionPane.INFORMATION_MESSAGE);

		System.out.println("Noticia Ingresada, Mensaje En Consola");
		
		JOptionPane.showMessageDialog(this, "Satisfactoriamente... Fue Ingresada Al SISTEMA EYE ","Agregar Noticia",JOptionPane.INFORMATION_MESSAGE);
		
		
		
			buttonLimpiarActionPerformed(evt);
		
	
	}
	
	private void buttonLimpiarActionPerformed (ActionEvent evt) {

		textId.setText("");
		textTitulo.setText("");
		textEncabezado.setText("");
		textContenido.setText("");
		
	}
}
	
	
	
	


