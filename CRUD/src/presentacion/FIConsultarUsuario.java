package presentacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import logica.Noticia;

public class FIConsultarUsuario extends JInternalFrame {

	
	
	private JLabel labelId_Noticia;
	private JTextField textId_Noticia;
	private JLabel labelTitulo;
	private JTextField textTitulo;
	private JLabel labelEncabezado;
	private JTextField textEncabezado;
	private JLabel labelContenido;	
	private JTextField textContenido;
	
	
	private JButton buttonActualizar;
	private JButton buttonConsultar;
	

	
	public FIConsultarUsuario() {
		
		initGUI();
	}
	
	private void initGUI() {
		
		setTitle("Consultar Producto SISTEMA EYE");
		
		setVisible(true);
		 
		setClosable(true);
		
		getContentPane().setLayout(new GridLayout(5,2,0,0));
		
		{
			
			labelId_Noticia = new JLabel();
			getContentPane().add(labelId_Noticia);
			labelId_Noticia.setText("Id");
		}
		
		{
			
			textId_Noticia = new JTextField();
			getContentPane().add(textId_Noticia);
						
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
		
		//Producto producto = new Producto(Integer.parseInt(this.textId_Noticia.getText(), this.textTitulo.getText(),Integer.parseInt(this.textEncabezado.getText()),Long.parseLong(this.textContenido.getText()));
		
		//JOptionPane.showMessageFialog(this,producto.agregar(buttonActualizarActionPerformed(evt);
		
		
		Noticia noticiaObj = new Noticia(Integer.parseInt(this.textId_Noticia.getText()));
		
		
		if(noticiaObj.consultar()) {
			
			this.textTitulo.setText(noticiaObj.getTitulo());
			
			this.textEncabezado.setText(String.valueOf(noticiaObj.getEncabezado()));
			
			this.textContenido.setText(String.valueOf(noticiaObj.getContenido()));
			
		}else {
			
			//Mensaje al no en contrar resultados
			
			JOptionPane.showMessageDialog(this, "No Existen Resultados","Consultar",JOptionPane.INFORMATION_MESSAGE);
		}
		
				
	}
	
	private void buttonActualizarActionPerformed (ActionEvent evt) {
		
		Noticia noticiaObj = new Noticia(Integer.parseInt(this.textId_Noticia.getText()),this.textTitulo.getText(),this.textEncabezado.getText(),this.textContenido.getText());
		
		JOptionPane.showMessageDialog(this,noticiaObj.actualizar(),"Actualizar", JOptionPane.INFORMATION_MESSAGE);
		
		
		textId_Noticia.setText("");
		textTitulo.setText("");
		textEncabezado.setText("");
		textContenido.setText("");
		
	}
	
	}
