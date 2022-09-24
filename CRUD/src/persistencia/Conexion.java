package persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Conexion {
	
	
	private Statement statement;
	private Connection conexion;
	private String jdbc;
	private String ruta;
	private String usuario;
	private String contra;

	
	
	public Conexion() {
		
		this.conexion = null;
		this.statement = null;
		this.jdbc = "com.mysql.cj.jdbc.Driver";
		this.ruta = "jdbc:mysql://localhost:3306/BD_EYE";
		this.usuario = "root";
		this.contra = "";
	}
	
	
	private void abrirConexion() {
		
		try {
			
			System.out.println("Conectando Base De Datos SISTEMA EYE");
			
			Class.forName(this.jdbc);
			
			this.conexion = DriverManager.getConnection(this.ruta,this.usuario,this.contra);
			
			//this.statement = this.connection.createStatement();
			
			this.statement = this.conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.TYPE_SCROLL_SENSITIVE);
					//ResultSet.TYPE_SCROLL_INSENSITIVE,
					
					/*ResultSet.CONCUR_READ_ONLY,
					ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.TYPE_SCROLL_SENSITIVE*/
						
			 		
				
			
			System.out.println("SISTEMA EYE , 100%");
			
		}catch (SQLException e) {
			
			//Error SQL
			
			e.printStackTrace();
		
			//JOptionPane.showMessageDialog(this,"Error Con La Conexion a la base de datos","Error",JOptionPane.WARNING_MESSAGE);
			
			
		}catch(ClassNotFoundException e) {
			
			//Error Clase no encontrada
			
			e.printStackTrace();
		}
	}
	
	//Ejecuta la sentencia final para la base de datos despues de estar conectada
	
	public String ejecutar(String sentencia) {
		
		try {
			
			this.abrirConexion();
			
			this.statement.executeUpdate(sentencia);
			
			return "Operacion Exitosa. Producto Efectuado Satisfactoriamente";
			
		}catch(SQLException e) {
			
			return e.toString();
			
		}
	}
	
	
	
	
	public ResultSet consultar(String sentencia) {
		
		
		ResultSet resultado = null;
		
		try {
			
			this.abrirConexion();
			
			
			resultado = this.statement.executeQuery(sentencia);
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		return resultado;
	}
}




/*System.out.println("Consultar Efectuado "  );

System.out.println("Sentencia"  );

System.out.println(sentencia );

System.out.println("resultado"  );

System.out.println(resultado );

*/