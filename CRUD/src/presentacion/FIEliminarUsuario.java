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

public class FIEliminarUsuario extends JInternalFrame {
	
	private JLabel labelId_Noticia;
	private JTextField textId_Noticia;
	private JLabel labelTitulo;
	private JTextField textTitulo;
	private JLabel labelEncabezado;
	private JTextField textEncabezado;
	private JLabel labelContenido;	
	private JTextField textContenido;
	
	
	
	//Botones
	
	private JButton buttonLimpiar;
	private JButton buttonConsultar;
	private JButton buttonEliminar;
	private JButton buttonRegresarInicio;
	
	public FIEliminarUsuario() {
		
		initGUI();
	}
	
	private void initGUI() {
		
		setTitle("Eliminar Producto Del Sistema EYE");
		setVisible(true);
		setClosable(true);
		getContentPane().setLayout(new GridLayout(6,2,0,0));
		
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
		
		textId_Noticia.setText("");
		textTitulo.setText("");
		textEncabezado.setText("");
		textContenido.setText("");
		
	}
	
	private void buttonLimpiarActionPerformed (ActionEvent evt) {
	
		textId_Noticia.setText("");
		textTitulo.setText("");
		textEncabezado.setText("");
		textContenido.setText("");
	
	}
	
	private void buttonConsultarActionPerformed(ActionEvent evt) {
		
	//	System.out.println("Consultando....1000%%%%");
		
		Noticia ObjNoticiaEliminar = new Noticia(Integer.parseInt(this.textId_Noticia.getText()));
		
		if (ObjNoticiaEliminar.consultar()) {
			
			this.textTitulo.setText(ObjNoticiaEliminar.getTitulo());
			this.textEncabezado.setText(ObjNoticiaEliminar.getEncabezado());
			this.textContenido.setText(ObjNoticiaEliminar.getContenido());
			
		}else {
			
			JOptionPane.showMessageDialog(this,"No Existe Noticia Identificada En La Base De Datos","Eliminar Noticia",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	private void buttonEliminarActionPerformed(ActionEvent evt) {
		
		Noticia ObjetoNoticia = new Noticia(Integer.parseInt(this.textId_Noticia.getText()));
		
		JOptionPane.showMessageDialog(this,ObjetoNoticia.eliminar());
		JOptionPane.showMessageDialog(this,"No Existe Noticia Identificada En La Base De Datos","Eliminar Noticia",JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	
}
	