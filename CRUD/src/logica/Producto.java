package logica;

import java.sql.ResultSet;
import java.sql.SQLException;

import persistencia.Conexion;
import persistencia.ProductoDAO;




public class Producto {
	
	private int id;
	private String nombre;
	private int cantidad;
	private long precio;
	private String filtro;
	
	
	
	public Producto() {
		
		
	}
	
	public Producto(int id, String nombre, int cantidad, long precio) {
		
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
				
	}
	
	public Producto(int id) {
		
		this.id = id;
	}
		
	public Producto(String filtro) {
		
		this.filtro = filtro;
	}
	
	public String  getFiltro() {
		return this.filtro;
	}
	/*public void setId() {
		
		this.id=id;
	}
	
	public int getId() {
		
		return this.id;
	}
	*/
	public void setNombre(String nombre) {
		
		 this.nombre = nombre;
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	public void setCantidad(int cantidad) {
		
		 this.cantidad=cantidad;
	}
	
	
	public int getCantidad() {
		
		return this.cantidad;
	}
	
	
	public void setPrecio(long precio) {
		
		 this.precio = precio;
	}
	
	public long getPrecio() {
		
		return this.precio;
	}
	
	/*
	
	public void setPrecio(long precio) {
		
		this.precio = precio;
	}
	public long getPrecio() {
		
		return this.precio;
	}
	
	
	
	public  void  setCantidad(int cantidad) {
		
		 this.cantidad = cantidad;
	}
	
	
	*/
	
	
	//INGRESAR
	
	public String insertar() {
		
		/*
		 * int id, String nombre, int cantidad, Long precio
		 */
	
		//Creacion de Obj. conexion.
		
		Conexion conexion = new Conexion();
		
		//Creacion del Obj. para mapear el DAO.
		ProductoDAO productomapeoDAO = new ProductoDAO(this.id, this.nombre, this.cantidad, this.precio);
		
		
		//Retorna Un Caracter de Cadena despues de instancias el productomapeDAO.insertar().
		return conexion.ejecutar(productomapeoDAO.insertar());
	}
	
	
	
	//CONSULTAR
	public boolean consultar() {

		Conexion conexion = new Conexion();
		
		ProductoDAO productoDAO = new ProductoDAO(this.id);
		
		ResultSet resultado = conexion.consultar(productoDAO.consultar());
	
		try {
					
						if(resultado.next()) {
				//Trae Los Resultados del base de datos con esa consulta de validacion con el IF...
							this.nombre = resultado.getString("nombre");
							this.cantidad = resultado.getInt("Cantidad");
							this.precio = resultado.getLong("precio");
							
							//Retorna Verdadero
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

	public String actualizar() {
		
		Conexion conexion = new Conexion();
		
		ProductoDAO productoDAO = new ProductoDAO(this.id,this.nombre,this.cantidad,this.precio);
		
		return conexion.ejecutar(productoDAO.actualizar());
	}
	
	
	//Metodo BUSCAR
	
	public String[][] buscar(String filtro){
		
		Conexion conexionBD = new Conexion();
		
		ProductoDAO productoDAO = new ProductoDAO();
		
		ResultSet resultado = conexionBD.consultar(productoDAO.buscar(filtro));
		
		System.out.println(filtro);
		String[][] datos = null;
				
		try {
				
			
			datos = new String[resultado.getRow()][4];
						
			resultado.beforeFirst();
			
			int i=0;
			
			while(resultado.next()) {
				
				datos[i][0] = resultado.getString("id");
				datos[i][1] = resultado.getString("nombre");
				datos[i][2] = resultado.getString("cantidad");
				datos[i][3] = resultado.getString("precio");
				i++;
			}
			
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		return datos;
		
	}
	
	//ELIMINAR
	public String eliminar() {
		
		Conexion conexion = new Conexion();
		
		ProductoDAO productoDAO = new ProductoDAO(this.id);
		
		return conexion.ejecutar(productoDAO.eliminar());
	}
	
}
