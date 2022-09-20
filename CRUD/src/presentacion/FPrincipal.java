package presentacion;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;




public class FPrincipal extends JFrame {

	
	
	private JMenuBar menuBar;
	private JMenu menuProducto;
	private JDesktopPane desktopPane;
	private JMenuItem menuItemBuscarProducto;
	private JMenuItem menuItemConsultarProducto;
	private JMenuItem menuItemAgregarProducto;
	private JMenuItem menuItemEliminarProducto;
	
	public FPrincipal() {
		initGUI();
	}
	
	public static void main (String[] args) {
		
		FPrincipal marcoPrincipalCRUD = new FPrincipal();
		 marcoPrincipalCRUD.setVisible(true);
		
	}
	  private void initGUI() {
		  
		  setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		  setTitle("Gestion De Productos SISTEMA EYE");
		  
		  {		  
			  desktopPane = new JDesktopPane();
			  getContentPane().add(desktopPane);
		  }
		  
		  {		
			  menuBar = new JMenuBar();
			  setJMenuBar(menuBar);
			  
			  {
				  menuProducto = new JMenu();
				  menuBar.add(menuProducto);
				  menuProducto.setText("Producto");
				  
				  {
					  menuItemAgregarProducto = new JMenuItem();
					  menuProducto.add(menuItemAgregarProducto);
					  menuItemAgregarProducto.setText("Agregar");
					  
					  menuItemAgregarProducto.addActionListener(new ActionListener(){
						  public void actionPerformed(ActionEvent evt) {
							  
							  menuItemAgregarProductoActionPerformed(evt);
						  }
					  });
				  }
			 
				  {
					  
					  menuItemConsultarProducto = new JMenuItem();
					  menuProducto.add(menuItemConsultarProducto);
					  menuItemConsultarProducto.setText("Consultar");
					  
					  menuItemConsultarProducto.addActionListener(new ActionListener(){
						  
						  public void actionPerformed(ActionEvent evt) {
							  
						  
							menuItemConsultarProductoActionPerformed(evt); 
						  }
					  });
					 }
				  
						  
				  {			  
					  menuItemBuscarProducto = new JMenuItem();
					  menuProducto.add(menuItemBuscarProducto);
					  menuItemBuscarProducto.setText("Buscar");
					
					  menuItemBuscarProducto.addActionListener(new ActionListener() {
						  
						  public void actionPerformed(ActionEvent evt) {
					  
							  	menuItemBuscarProductoActionPerformed(evt);
						  }
					  
					  });
			  			  
				  }
				  {
					  menuItemEliminarProducto = new JMenuItem();
					  menuProducto.add(menuItemEliminarProducto);
					  menuItemEliminarProducto.setText("Eliminar");
					  
					  menuItemEliminarProducto.addActionListener(new ActionListener() {
						  
						  public void actionPerformed(ActionEvent evt) {
							  
							  menuItemEliminarProductoActionPerformed(evt);
						  }
						  
					  });
					  
				  }
				  
			  
			}
				  
	  }
		  setSize(400, 300);
		  
	}		  
		  protected void menuItemAgregarProductoActionPerformed(ActionEvent evt) {
			  
			  FIAgregarProducto frame = new FIAgregarProducto();
			  this.desktopPane.add(frame);
			  
		  }
		  
		  private void menuItemConsultarProductoActionPerformed(ActionEvent evt) {
			  
			  FIConsultarProducto frame = new FIConsultarProducto();
			  this.desktopPane.add(frame);
			  
		  }
		  
		  private void menuItemBuscarProductoActionPerformed(ActionEvent evt) {
			  
			  FIBuscarProducto frame = new FIBuscarProducto();
			  this.desktopPane.add(frame);
			  
		  }
		  
		  private void menuItemEliminarProductoActionPerformed(ActionEvent evt){
			  
			  FIEliminarProducto frame = new FIEliminarProducto();
			  this.desktopPane.add(frame);
		  }
		   
}
	  
