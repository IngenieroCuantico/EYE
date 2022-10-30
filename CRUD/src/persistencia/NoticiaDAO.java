package persistencia;

//Clase Principal

public class NoticiaDAO {

	//Variables Declaradas
	private int id;
	private String titulo;
	private String encabezado;
	private String contenido;

	//Metodo Principal	, Creacion de objeto vacio
	public NoticiaDAO() {
		
	}

	//Creacion de metodo constructor con parametro ID.
	
	public NoticiaDAO(int id) {
			this.id = id;
	}

	//Creacion de metodo constructor con todos las variables de los atributos
	//parametrizados
	
	public NoticiaDAO(int id, String titulo, String encabezado, String contenido) {
		
		this.id = id;
		this.titulo = titulo;
		this.encabezado = encabezado;
		this.contenido = contenido;
	
	}

	public NoticiaDAO(String titulo) {
		this.titulo = titulo;
	}
	

	public int getId() {
		return this.id;
	}

	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getEncabezado() {
		return this.encabezado;
	}
	
	public String getcontenido() {
		return this.contenido;
	}
	
	
	
	
	//insertando noticia a la BD
	
	public String insertar() {
	
		return "insert into Noticia (id_noticia, titulo, encabezado, contenido)values('"+this.id+"','"+this.titulo+"','"+this.encabezado+"','"+this.contenido+"')";
		
	}
	
	
	
	
	//Metodo consultar en el mapeo con la consulta a la BD
	public String consultar() {
		return "select * from Noticia where id_noticia = '"+this.id+"'";
	}
	
	
	//Metodo actualizar en el mapeo con la consulta a la BD
	public String actualizar() {
		return "update Noticia set titulo ='"+this.titulo+"',encabezado = '"+this.encabezado+"',contenido='"+this.contenido+"' where id_noticia = '"+this.id+"'";
	}
	
	
	//Metodo eliminar en el mapeo con la consulta a la BD
	public String eliminar() {
		return "delete from Noticia where id_noticia = '"+this.id+"'";
	}
	
	
	//Metodo buscar en el mapeo con la consulta a la BD, se le pasa por parametro el filtro obtenido en el JTextField del JPANEL BUSCAR()....
	//String filtro
	public String buscar(String filtro) {
		
		return "select * from Noticia where titulo like'"+filtro+"%'";
	}	
	
	
	
	
	
}



/*	

public static void main(String[] args) {
	// TODO Auto-generated method stub

}
*/