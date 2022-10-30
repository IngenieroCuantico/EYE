package presentacion;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Dimension;
import java.awt.BorderLayout;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


import logica.Noticia;

public class FIBuscarUsuario extends JInternalFrame {
	
	private JTextField textFiltro;
	
	private JTable tabla;
	
	private JScrollPane scrollpane;
	
	
	private JTextField textResultado;
	
	public FIBuscarUsuario() {
		
		initGUI();
	}
	
	
	
	
	private void initGUI() {
		
		setTitle("Buscar Noticia SISTEMA EYE");
		
		setVisible(true);
		
		setClosable(true);
		
		getContentPane().setLayout(new BorderLayout());
		
		
			{
				textFiltro = new JTextField();
				
				getContentPane().add(textFiltro, BorderLayout.NORTH);
				
				
				textFiltro.addKeyListener(new KeyAdapter() {
				
					public void KeyReleased(KeyEvent evt) {
						
						textFiltroKeyReleased(evt);
						

					}	
				});
			}
			
			{
				textResultado = new JTextField();
				
				getContentPane().add(textResultado, BorderLayout.SOUTH);
				
		
				//System.out.println(texto);
				
				
				/*textFiltro.addKeyListener(new KeyAdapter() {
				
					public void KeyReleased(KeyEvent evt) {
						
						textFiltroKeyReleased(evt);
					}	
				});*/
			}
			
			
						
			setSize(400,300);	
		}
	
	
	
	
	private void textFiltroKeyReleased(KeyEvent evt){
		
		
		Noticia noticia = new Noticia();	
		
		
		//producto.buscar(this.textFiltro.getText());
		//  this.textResultado.setText(String.valueOf(this.textFiltro.getText()));
	
		{
			 
			 scrollpane = new JScrollPane();
			 
			 getContentPane().add(scrollpane, BorderLayout.CENTER);
			 
			 //panel /getContentPane();
			 
			 scrollpane.setBounds(50,30,320,120);
			 
			 {
				 
					String [][] datos = noticia.buscar(this.textFiltro.getText());
					
						
					String [] titulos = new String[] {"Id","Nombre","Cantidad","Precio"};
					
				
					TableModel modelotabla = new DefaultTableModel(datos,titulos);
					
					//System.out.println(evt);
				
					tabla = new JTable();
					
					tabla.setModel(modelotabla);
					
					tabla.setPreferredSize(new Dimension(350,datos.length*16));
					
					//tabla.setVisible(true);
			
					scrollpane.setViewportView(tabla);			 		 
					/*tabla.setVisible(true);*/		 
				 
					 TableRowSorter ordenador = new TableRowSorter(modelotabla);
					 
					 tabla.setRowSorter(ordenador);

				 
			 }
			 
				 
		}
		
		
		 
		
		
		
		
	}
	
	
}
	

	

	
	
	
//System.out.println(datos);
/*{{"10","Hector","Florez","456"},{"14","H","g","698"},
	 {"230","Hector","Florez","456"},
	 {"333","Hector","Florez","456"},
	 {"44","Hector","Florez","456"},
	 {"4","Hector","Florez","456"},
	 {"55","Hector","Florez","456"},
	 {"55","Hector","Florez","456"},
	 {"55","Hector","Florez","456"},
	 {"55","Hector","Florez","456"},
	 {"55","Hector","Florez","456"},
	 {"55","Hector","Florez","456"},
	 {"55","Hector","Florez","456"},
	 {"55","Hector","Florez","456"}};*/

	
	//
	//producto.buscar(this.textFiltro.getText());
