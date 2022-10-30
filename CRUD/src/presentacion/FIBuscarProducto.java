package presentacion;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Dimension;
import java.awt.BorderLayout;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


import logica.Producto;




public class FIBuscarProducto extends JInternalFrame {
	
	
	private JTextField textFiltro;
	
	private JTextField textresul;
	
	private JTable tabla;
	
	private JScrollPane scrollpane;	

	
	
	
	
	public FIBuscarProducto() {
		
		initGUI();
	}
	
	
	
	
	private void initGUI() {
		
		setTitle("Buscar Producto SISTEMA EYE");
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
			setSize(500,400);	
		}
	
	
	
	
	private void textFiltroKeyReleased(KeyEvent evt){
		
		
			
	}

	Producto producto = new Producto();
	
	String nombre = producto.getNombre();
	
	
	 
	 
	String [][] datos = producto.buscar(this.textFiltro.getText());
	
		//{{"55","Hector","Florez","456"},
			// {"55","Hector","Florez","456"}};
	 
			//producto.buscar(nombre);


	
	
	//String resultadoproducto	= producto.toString();
	
	
	// this.textResultado.setText(String.valueOf(this.textFiltro.getText()));
	
	
	{
		 scrollpane = new JScrollPane();
		 getContentPane().add(scrollpane, BorderLayout.CENTER);
		 scrollpane.setBounds(50,30,320,120);
	 {			
			
			String [] titulos = new String[] {"Id","Nombre","Cantidad","Precio"};
			
			TableModel modelotabla = new DefaultTableModel(datos, titulos);
			tabla = new JTable();
			tabla.setModel(modelotabla);
			tabla.setPreferredSize(new Dimension(350,datos.length*16));
			//tabla.setVisible(true);

			scrollpane.setViewportView(tabla);			 		 

		 
			TableRowSorter ordenador = new TableRowSorter(modelotabla); 
			tabla.setRowSorter(ordenador);

		 
		 }
		 
		 	 
	}



}
	

	

	
	
	

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