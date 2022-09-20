package persistencia;



public class ProductoDAO {

	private int id;
	private String nombre;
	private int cantidad;
	private long precio;
	//private String filtro;
	
	
	public ProductoDAO() {
		
	}
	
	public ProductoDAO(int id, String nombre, int cantidad, long precio) {
		
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		
	}
	
	public ProductoDAO(int id) {
		
	this.id = id;
		
	}
	
	public ProductoDAO(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public int getIdProductoDAO() {
		
		return this.id;
	}
	
	
	
	public String insertar() {
		return "insert into Producto (id, nombre, cantidad, precio)values('"+this.id+"','"+this.nombre+"','"+this.cantidad+"','"+this.precio+"')";
	}
	
	
	public String consultar() {
		return "select * from Producto where id = '"+this.id+"'";
	}
	
	
	public String actualizar() {
		return "update Producto set nombre ='"+this.nombre+"',cantidad = '"+this.cantidad+"',precio='"+this.precio+"' where id = '"+this.id+"'";
	}
	
	
	public String eliminar() {
		return "delete from Producto where id = '"+this.id+"'";
	}
	
	
	public String buscar(String filtro) {
		return "select * from Producto where nombre like'"+filtro+"%'";
	}	
	
	
	
	
	
}



/*	

public static void main(String[] args) {
	// TODO Auto-generated method stub

}
*/
