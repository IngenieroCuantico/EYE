package logica;

import java.sql.ResultSet;
import java.sql.SQLException;

import persistencia.Conexion;
import persistencia.NoticiaDAO;



//Metodo Principal De Producto

public class Noticia {
	
	
	private int id;
	private String titulo;
	private String encabezado;
	private String contenido;

	//Metodo Constructor Sobrecargado Vacio De Producto
	public Noticia() {
	}
	
	//metodo sobrecargado de Producto pasando por parametros
	
	public Noticia(int id, String titulo, String encabezado, String contenido) {
	
		this.id = id;
		this.titulo =  titulo;
		this.encabezado = encabezado;		
		this.encabezado = contenido;
	
		//se refieren a las variables declaradas en la clase principal
		//teniendo en cuenta que son asignadas por este metodo constructor
		//Que recibe como parametros los 4 atributos para insertar en la base de datos.
	}
	
	public Noticia(int id) {
	
		this.id = id;
	}
	
		
	public Noticia(String titulo) {
		
		this.titulo = titulo;
	}
	
	public int getID() {
		
		return this.id;
	}
	
	public String getTitulo() {
		
		return this.titulo;
	}
	
	public void setEncabezado(String encabezado) {
		
		 this.encabezado = encabezado;
	}
	
	
	public String getEncabezado() {
		
		return this.encabezado;
	}
	
	
	public void setContenido(String contenido) {
		
		 this.contenido = contenido;
	}
	
	public String getContenido() {
		
		return this.contenido;
	}
	

	
	
	//_::::::::::::::::::::::::::::::::::::::::::::::::::
	//INGRESAR
	
	public String insertar() {
		/*
		 * int id, String titulo, int encabezado, Long contenido
		 */
		//Creacion de Obj. conexion.
		Conexion conexion = new Conexion();
		//Creacion del Obj. para mapear el DAO.
		NoticiaDAO noticiamapeoDAO = new NoticiaDAO(this.id, this.titulo, this.encabezado, this.contenido);		
		//Retorna Un Caracter de Cadena despues de instancias el productomapeDAO.insertar().
		
		return conexion.ejecutar(noticiamapeoDAO.insertar());
	}
	
	
	//_::::::::::::::::::::::::::::::::::::::::::::::::::
	//CONSULTAR
	public boolean consultar() {

		Conexion conexion = new Conexion();
		
		NoticiaDAO NoticiaDAO = new NoticiaDAO(this.id);
		
		ResultSet resultado = conexion.consultar(NoticiaDAO.consultar());
	
		try {
			
			System.out.println(resultado);
					
						if(resultado.next()) {
				//Trae Los Resultados del base de datos con esa consulta de validacion con el IF...
							this.titulo = resultado.getString("titulo");
							this.encabezado = resultado.getString("encabezado");
							this.contenido = resultado.getString("contenido");
			
							System.out.println(this.id);
							System.out.println("_______");
							
							System.out.println(this.titulo);
							System.out.println("_______");

							System.out.println(this.encabezado);
							System.out.println("_______");

							System.out.println(this.contenido);
							System.out.println("_______");
							
							
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

	
	//_::::::::::::::::::::::::::::::::::::::::::::::::::
	//ACTUALIZAR
	public String actualizar() {
		
		Conexion conexion = new Conexion();
		
		NoticiaDAO NoticiaDAO = new NoticiaDAO(this.id,this.titulo,this.encabezado,this.contenido);
		
		return conexion.ejecutar(NoticiaDAO.actualizar());
		
	}
	
	
	
	
	//_::::::::::::::::::::::::::::::::::::::::::::::::::
	//BUSCAR
	
	public String[][] buscar(String c){
				
		//Objeto de la conexion a la base de datos
		
		Conexion conexion = new Conexion();
		
		//Objeto del mapeo NoticiaDAO
		
		NoticiaDAO NoticiaDAO = new NoticiaDAO();
		
		//this.id,this.titulo,this.encabezado,this.contenido
									
		//Creacion de la variable datos MATRIZ	
		
		String[][] datos = null;
		
		//Objeto ResultSet.
		
		ResultSet resultado =  conexion.consultar("select * from Noticia where titulo like'"+c+"%'"); 
				
				
		try {	
			//resultado.last();
			
			
			//resultado.afterLast();
				
			resultado.last();
			
			
			datos = new String[resultado.getRow()][4];
			
			int i=0;
			
			while(resultado.next()) {
		
					
				
				datos[i][0] = resultado.getString("id");
				datos[i][1] = resultado.getString("titulo");
				datos[i][2] = resultado.getString("encabezado");
				datos[i][3] = resultado.getString("contenido");
			
				i++;
			System.out.println(i);		
			
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
		
		NoticiaDAO NoticiaDAO = new NoticiaDAO(this.id);
		
		return conexion.ejecutar(NoticiaDAO.eliminar());
	}
	
}
