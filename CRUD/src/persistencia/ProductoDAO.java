


package persistencia;



public class ProductoDAO {

	//Variables Declaradas
	private int id;
	private String nombre;
	private int cantidad;
	private long precio;

	
	
	public ProductoDAO() {
		
	}


	public ProductoDAO(int id) {
			this.id = id;
	}

	
	public ProductoDAO(int id, String nombre, int cantidad, long precio) {
		
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	
	}
	

	
	public ProductoDAO(String nombre) {
		this.nombre = nombre;
	}
	

	
	
	public int getId() {
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
	
	
	
	
	//Metodo insertar en el mapeo con la consulta a la BD
	
	public String insertar() {
		return "insert into Producto (id, nombre, cantidad, precio)values('"+this.id+"','"+this.nombre+"','"+this.cantidad+"','"+this.precio+"')";
	}
	
	
	//Metodo consultar en el mapeo con la consulta a la BD
	public String consultar() {
		return "select * from Producto where id = '"+this.id+"'";
	}
	
	
	//Metodo actualizar en el mapeo con la consulta a la BD
	public String actualizar() {
		return "update Producto set nombre ='"+this.nombre+"',cantidad = '"+this.cantidad+"',precio='"+this.precio+"' where id = '"+this.id+"'";
	}
	
	
	//Metodo eliminar en el mapeo con la consulta a la BD
	public String eliminar() {
		return "delete from Producto where id = '"+this.id+"'";
	}
	
	
	//Metodo buscar en el mapeo con la consulta a la BD, se le pasa por parametro el filtro obtenido en el JTextField del JPANEL BUSCAR()....
	//String filtro
	public String buscar(String filtro) {
		
		return "select * from Producto where nombre like '"+filtro+"%'";
	}	
	
	
	
	
	
}



/*	

public static void main(String[] args) {
	// TODO Auto-generated method stub

}
*/
