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

	
	private JDesktopPane desktopPane;
	
	private JMenuBar menuBar;
	private JMenuBar menuBar2;
	private JMenuBar menuBar3;
	
	private JMenu menuProducto;
	private JMenu menuNoticia;
	private JMenu menuUsuario;
	private JMenu menuAdministradores;
	
	//PRODUCTO
	private JMenuItem menuItemBuscarProducto;
	private JMenuItem menuItemConsultarProducto;
	private JMenuItem menuItemAgregarProducto;
	private JMenuItem menuItemEliminarProducto;
	
	//NOTICIA
	private JMenuItem menuItemBuscarNoticia;
	private JMenuItem menuItemConsultarNoticia;
	private JMenuItem menuItemAgregarNoticia;
	private JMenuItem menuItemEliminarNoticia;
	
	//USUARIO
	private JMenuItem menuItemBuscarUsuario;
	private JMenuItem menuItemConsultarUsuario;
	private JMenuItem menuItemAgregarUsuario;
	private JMenuItem menuItemEliminarUsuario;
	
	//ADMINISTRADORES
	private JMenuItem menuItemBuscarAdministradores;
	private JMenuItem menuItemConsultarAdministradores;
	private JMenuItem menuItemAgregarAdministradores;
	private JMenuItem menuItemEliminarAdministradores;
	
	
	
	public FPrincipal() {
		initGUI();
	}
	
	public static void main (String[] args) {
		
		FPrincipal marcoPrincipalCRUD = new FPrincipal();
		
		 marcoPrincipalCRUD.setVisible(true);
	
	}
	
	
	private void initGUI()
	
		{
		  
		  setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		  setTitle("Informacion Central SISTEMA EYE");
		  /*
		{		  
		  desktopPane = new JDesktopPane();
		  getContentPane().add(desktopPane);
		}
		*/
		
			
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
					  menuItemAgregarProducto.setText("Agregar_Producto");
					  
					  menuItemAgregarProducto.addActionListener(new ActionListener(){
						  public void actionPerformed(ActionEvent evt) {
							  
							  menuItemAgregarProductoActionPerformed(evt);
						  }
					  });
				  
				  }
			  
 
				  {
					  
					  menuItemConsultarProducto = new JMenuItem();
					  menuProducto.add(menuItemConsultarProducto);
					  menuItemConsultarProducto.setText("Consultar_Producto");
					  
					  menuItemConsultarProducto.addActionListener(new ActionListener(){
						  
						  public void actionPerformed(ActionEvent evt) {
							  
						  
							menuItemConsultarUsuarioActionPerformed(evt); 
						  }
					  });
					}
				  
						  
				  	{			  
					  menuItemBuscarProducto = new JMenuItem();
					  menuProducto.add(menuItemBuscarProducto);
					  menuItemBuscarProducto.setText("Buscar_Producto");
					
					  menuItemBuscarProducto.addActionListener(new ActionListener() {
						  
						  public void actionPerformed(ActionEvent evt) {
					  
								menuItemBuscarProductoActionPerformed(evt);
						  }
					  
					  });
						  
				  	}
				  
				  
				  	{
					  menuItemEliminarProducto = new JMenuItem();
					  menuProducto.add(menuItemEliminarProducto);
					  menuItemEliminarProducto.setText("Eliminar_Producto");
						  
					  menuItemEliminarProducto.addActionListener(new ActionListener() {
						  
						  public void actionPerformed(ActionEvent evt) {
							  
							  menuItemEliminarProductoActionPerformed(evt);
						  }
			  
					  });
						  
					}
			 }				  
			   

			  
			{
				  menuNoticia = new JMenu();
				  menuBar.add(menuNoticia);
				  menuNoticia.setText("Noticia");
				
					{
						  menuItemAgregarNoticia = new JMenuItem();
						  menuNoticia.add(menuItemAgregarNoticia);
						  menuItemAgregarNoticia.setText("Agregar_Noticia");
						  
						  menuItemAgregarNoticia.addActionListener(new ActionListener(){
							  public void actionPerformed(ActionEvent evt) {
								  
								  menuItemAgregarNoticiaActionPerformed(evt);
							  }
						  });
					  
					  }
		  
	 
					  {
				  
						  menuItemConsultarNoticia = new JMenuItem();
						  menuNoticia.add(menuItemConsultarNoticia);
						  menuItemConsultarNoticia.setText("Consultar_Noticia");
						  
						  menuItemConsultarNoticia.addActionListener(new ActionListener(){
							  
							  public void actionPerformed(ActionEvent evt) {
								  
							  
								menuItemConsultarNoticiaActionPerformed(evt); 
							  }
						  });
						}
			  
						  
					  {			  
						  menuItemBuscarNoticia = new JMenuItem();
						  menuNoticia.add(menuItemBuscarNoticia);
						  menuItemBuscarNoticia.setText("Buscar_Noticia");
						
						  menuItemBuscarNoticia.addActionListener(new ActionListener() {
							  
							  public void actionPerformed(ActionEvent evt) {
						  
									menuItemBuscarNoticiaActionPerformed(evt);
							  }
						  
						  });
							  
						}
				  
				  
					  {
						  menuItemEliminarNoticia = new JMenuItem();
						  menuNoticia.add(menuItemEliminarNoticia);
						  menuItemEliminarNoticia.setText("Eliminar_Noticia");
						  
							  menuItemEliminarNoticia.addActionListener(new ActionListener() {
								  
									  public void actionPerformed(ActionEvent evt) {
										  
										  menuItemEliminarNoticiaActionPerformed(evt);
									  }
								  
							  });
						  
					  }
												  
			  
			}
			  
			  ///*********************
			  //*****
			  
			  
			  {
				  menuUsuario = new JMenu();
				  menuBar.add(menuUsuario);
				  menuUsuario.setText("Usuario");
				
				{
				  menuItemAgregarUsuario = new JMenuItem();
				  menuUsuario.add(menuItemAgregarUsuario);
				  menuItemAgregarUsuario.setText("Agregar_Usuario");
				  
				  menuItemAgregarUsuario.addActionListener(new ActionListener(){
					  public void actionPerformed(ActionEvent evt) {
						  
						  menuItemAgregarUsuarioActionPerformed(evt);
					  }
				  });
			  
				}
			  
			 
			  {
				  
				  menuItemConsultarUsuario = new JMenuItem();
				  menuUsuario.add(menuItemConsultarUsuario);
				  menuItemConsultarUsuario.setText("Consultar_Usuario");
				  
				  menuItemConsultarUsuario.addActionListener(new ActionListener(){
					  
					  public void actionPerformed(ActionEvent evt) {
						  
					  
						menuItemConsultarUsuarioActionPerformed(evt); 
					  }
				  });
				}
  
  
			  {			  
				  menuItemBuscarUsuario = new JMenuItem();
				  menuUsuario.add(menuItemBuscarUsuario);
				  menuItemBuscarUsuario.setText("Buscar_Usuario");
		
				  menuItemBuscarUsuario.addActionListener(new ActionListener() {
			  
					  public void actionPerformed(ActionEvent evt) {
		  
						  menuItemBuscarUsuarioActionPerformed(evt);
					  }
				  
				  });
					  
				}
				  
				  
				  {
					  menuItemEliminarUsuario = new JMenuItem();
					  menuUsuario.add(menuItemEliminarUsuario);
					  menuItemEliminarUsuario.setText("Eliminar_Usuario");
					  
						  menuItemEliminarUsuario.addActionListener(new ActionListener() {
							  
								  public void actionPerformed(ActionEvent evt) {
									  
									  menuItemEliminarUsuarioActionPerformed(evt);
								  }
							  
						  });
					  
				  }
				  
				  
			  {
					  menuAdministradores = new JMenu();
					  menuBar.add(menuAdministradores);
					  menuAdministradores.setText("Administradores");
					
				{
					  menuItemAgregarAdministradores = new JMenuItem();
					  menuAdministradores.add(menuItemAgregarAdministradores);
					  menuItemAgregarAdministradores.setText("Agregar_Administradores");
					  
					  menuItemAgregarAdministradores.addActionListener(new ActionListener(){
						  public void actionPerformed(ActionEvent evt) {
							  
							  menuItemAgregarAdministradoresActionPerformed(evt);
						  }
					  });
				  
				  }
					  
				 
				  {
					  
					  menuItemConsultarAdministradores = new JMenuItem();
					  menuAdministradores.add(menuItemConsultarAdministradores);
					  menuItemConsultarAdministradores.setText("Consultar_Administradores");
					  
					  menuItemConsultarAdministradores.addActionListener(new ActionListener(){
						  
						  public void actionPerformed(ActionEvent evt) {
							  
						  
							menuItemConsultarAdministradoresActionPerformed(evt); 
						  }
					  });
					}
					  
							  
				  {			  
					  menuItemBuscarAdministradores = new JMenuItem();
					  menuAdministradores.add(menuItemBuscarAdministradores);
					  menuItemBuscarAdministradores.setText("Buscar_Administradores");
					
					  menuItemBuscarAdministradores.addActionListener(new ActionListener() {
						  
						  public void actionPerformed(ActionEvent evt) {
					  
								menuItemBuscarAdministradoresActionPerformed(evt);
						  }
					  
					  });
						  
					}
					  
					  
				  {
					  menuItemEliminarAdministradores = new JMenuItem();
					  menuAdministradores.add(menuItemEliminarAdministradores);
					  menuItemEliminarAdministradores.setText("Eliminar_Administradores");
					  
						  menuItemEliminarProducto.addActionListener(new ActionListener() {
							  
								  public void actionPerformed(ActionEvent evt) {
									  
									  menuItemEliminarAdministradoresActionPerformed(evt);
								  }
							  
						  });
					  
				  }
													  
				  
				}
				  
			  
			}
			  
				  
		 }
	
		  setSize(600, 600);
  
	}		
		  
	  	  
	  
	  
	  
			    
		
			  
			  
			  //PRODUCTO VENTANAS FRAMES
			  
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
		  
		  
		  
		  
		  
		  
		  	//FRAMES NOTICIA MENU
		  
		  private void menuItemAgregarNoticiaActionPerformed(ActionEvent evt) {
			  
			  FIAgregarNoticia frame = new FIAgregarNoticia();
			  this.desktopPane.add(frame);
			  
		  }
		  private void menuItemConsultarNoticiaActionPerformed(ActionEvent evt) {
			  
			  FIConsultarNoticia frame = new FIConsultarNoticia();
			  this.desktopPane.add(frame);
			  
		  }
		  
		  private void menuItemBuscarNoticiaActionPerformed(ActionEvent evt) {
			  
			  FIBuscarNoticia frame = new FIBuscarNoticia();
			  this.desktopPane.add(frame);
			  
		  }
		  
		  private void menuItemEliminarNoticiaActionPerformed(ActionEvent evt){
			  
			  FIEliminarNoticia frame = new FIEliminarNoticia();
			  this.desktopPane.add(frame);
		  }
		  

		  	//FRAMES USUARIO MENU
		  
		  private void menuItemAgregarUsuarioActionPerformed(ActionEvent evt) {
			  
			  FIAgregarUsuario frame = new FIAgregarUsuario();
			  this.desktopPane.add(frame);
			  
		  }
		  private void menuItemConsultarUsuarioActionPerformed(ActionEvent evt) {
			  
			  FIConsultarUsuario frame = new FIConsultarUsuario();
			  this.desktopPane.add(frame);
			  
		  }
		  
		  private void menuItemBuscarUsuarioActionPerformed(ActionEvent evt) {
			  
			  FIBuscarUsuario frame = new FIBuscarUsuario();
			  this.desktopPane.add(frame);
			  
		  }
		  
		  private void menuItemEliminarUsuarioActionPerformed(ActionEvent evt){
			  
			  FIEliminarUsuario frame = new FIEliminarUsuario();
			  this.desktopPane.add(frame);
		  }
		   

		  	//FRAMES ADMINISTRADORES MENU
		  
		  private void menuItemAgregarAdministradoresActionPerformed(ActionEvent evt) {
			  
			  
			  FIAgregarUsuario frame = new FIAgregarUsuario();
			  this.desktopPane.add(frame);
			  
		  }
		  private void menuItemConsultarAdministradoresActionPerformed(ActionEvent evt) {
			  
			  FIConsultarUsuario frame = new FIConsultarUsuario();
			  this.desktopPane.add(frame);
			  
		  }
		  
		  private void menuItemBuscarAdministradoresActionPerformed(ActionEvent evt) {
			  
			  FIBuscarUsuario frame = new FIBuscarUsuario();
			  this.desktopPane.add(frame);
			  
		  }
		  
		  private void menuItemEliminarAdministradoresActionPerformed(ActionEvent evt){
			  
			  FIEliminarUsuario frame = new FIEliminarUsuario();
			  this.desktopPane.add(frame);
		  }
}
	 
	  
