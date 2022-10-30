package logica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.DatabaseMetaData;

import javax.swing.JOptionPane;

import persistencia.Conexion;
import persistencia.ProductoDAO;



//Metodo Principal De Producto

public class Producto {

	
	private int id;
	private String nombre;
	private int cantidad;
	private long precio;
		
	
	public Producto() {
		
		
	}
	
	//metodo sobrecargado de Producto pasando por parametros 
	public Producto(int id, String nombre, int cantidad, long precio) {
		
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
				
	}
	
	public Producto(int id) {
		
		this.id = id;
	
	}
	
	
	public Producto(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	
	public int getCantidad() {
		
		return this.cantidad;
	}
		
	public long getPrecio() {
		
		return this.precio;
	}
	

	//_::::::::::::::::::::::::::::::::::::::::::::::::::
	//INGRESAR
	
	public String insertar() {
		
		Conexion conexion = new Conexion();
		ProductoDAO productoDAO = new ProductoDAO(this.id, this.nombre, this.cantidad, this.precio);
		
		return conexion.ejecutar(productoDAO.insertar());
			
	}
	
	
	//_::::::::::::::::::::::::::::::::::::::::::::::::::
	//CONSULTAR
	public boolean consultar() {

		Conexion conexion = new Conexion();
		ProductoDAO productoDAO = new ProductoDAO(this.id);
		ResultSet resultado = conexion.consultar(productoDAO.consultar());
	
		try {
			
			System.out.println(resultado);
					
						if(resultado.next()) {
				//Trae Los Resultados del base de datos con esa consulta de validacion con el IF...
							this.nombre = resultado.getString("nombre");
							this.cantidad = resultado.getInt("Cantidad");
							this.precio = resultado.getLong("precio");
			
							//Retorna Verdadero Respuesta Despues
							//De Consultar Bien
	
							return true;
							
						}else {
							//Retorna Falso
							return false;
							
						}
						
						//Error por el catch
		}catch (SQLException e) {
				
			e.printStackTrace();
			
			return false;
			
		}
		
	}

	
	//_::::::::::::::::::::::::::::::::::::::::::::::::::
	//ACTUALIZAR
	public String actualizar() {
		
		Conexion conexion = new Conexion();
	
		ProductoDAO productoDAO = new ProductoDAO(this.id,this.nombre,this.cantidad,this.precio);
		
		return conexion.ejecutar(productoDAO.actualizar());
		
	}
	
	//_::::::::::::::::::::::::::::::::::::::::::::::::::
	//BUSCAR
	
	public String[][] buscar(String filtro){
		
			
		Conexion conexion = new Conexion();
			
		ProductoDAO productoDAO = new ProductoDAO();
		//System.out.println(productoDAO);
	
		ResultSet resultado =  conexion.consultar(productoDAO.buscar(filtro));
			
		String[][] datos = null;
		
		//System.out.println(resultado);
		try {
			
			System.out.println(resultado);
			
			resultado.last();
					
			datos = new String[resultado.getRow()][4];
			
			int i=0;
			
			while(resultado.next()) {
				datos[i][0] = resultado.getString("id");
				datos[i][1] = resultado.getString("nombre");
				datos[i][2] = resultado.getString("cantidad");
				datos[i][3] = resultado.getString("precio");
				
					i++;		
			}	
			
			resultado.beforeFirst();
			

		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return datos;
		
	}
	
	//_::::::::::::::::::::::::::::::::::::::::::::::::::
	//ELIMINAR
	public String eliminar() {
		
		Conexion conexion = new Conexion();
		
		ProductoDAO productoDAO = new ProductoDAO(this.id);
		
		return conexion.ejecutar(productoDAO.eliminar());
	}
	
}



/*	public void setCantidad(int cantidad) {

this.cantidad=cantidad;
}
*/



/*
 * int id, String nombre, int cantidad, Long precio
 */

//Creacion de Obj. conexion.



//Creacion del Obj. para mapear el DAO.

//Retorna Un Caracter de Cadena despues de instancias el productomapeDAO.insertar().



/*		System.out.println("__Este es el id consultado__por consola");
		System.out.println(this.id);
		System.out.println("_______");
		
		System.out.println("__Este es el nombre consultado__por consola");
		System.out.println(this.nombre);
		System.out.println("_______");

		System.out.println("__Este es la cantidad__por consola");
		System.out.println(this.cantidad);
		System.out.println("_______");

		System.out.println("__Este es el precio consultado__por consola");
		System.out.println(this.precio);
		System.out.println("_______");
		
		*/