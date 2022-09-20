package presentacion;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Dimension;


import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


import logica.Producto;

public class FIBuscarProducto extends JInternalFrame {
	
	private JTextField textFiltro;
	
	private JTable tableResultados;
	
	private JScrollPane scrollPaneResultados;
	
	
	
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
			{
				 scrollPaneResultados = new JScrollPane();
				 getContentPane().add(scrollPaneResultados,BorderLayout.CENTER);
				 //scrollPane.setBounds(40,20,320,120);
			}
			
			setSize(350,200);	
		}
	
	private void textFiltroKeyReleased(KeyEvent evt){
		
		
		Producto producto = new Producto();
		
		String [][] datos = producto.buscar(this.textFiltro.getText());
		
		String [] titulos = new String[] {"Id","Nombre","Cantidad","Precio"};
		
		TableModel tableModelResultados = new DefaultTableModel(datos,titulos);
		
		System.out.println(evt);
	
		
		tableResultados = new JTable();
		 	
		
		tableResultados.setModel(tableModelResultados);
		tableResultados.setPreferredSize(new Dimension(250,100));
		tableResultados.setVisible(true);
		scrollPaneResultados.setViewportView(tableResultados);
		
			
		//	Creacion del objeto TableRowSorter, trae la tableModeloResultados, para mostrar en pantalla.
		
		TableRowSorter ordenadordelascolumnas = new TableRowSorter(tableModelResultados);
		
		tableResultados.setRowSorter(ordenadordelascolumnas);
			
	}
	
	
}
	

	

	
	
	
	