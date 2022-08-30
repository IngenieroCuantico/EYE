package interfaz.formulario;

//importando librerias
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class PPasatiempos extends JPanel{
	
		
		private JCheckBox checkFutbol;
		private JCheckBox checkBaloncesto;
		private JCheckBox checkNatacion;
		private JCheckBox checkCine;
		private JCheckBox checkTeatro;
		private JCheckBox checkAtletismo;
		private JCheckBox checkTenis;

		
		public PPasatiempos(){
			
			initGUI();
		}
	
		
		private void initGUI(){
	
		{
			checkFutbol = new JCheckBox();
			this.add(checkFutbol);
			checkFutbol.setText("Futbol");
	
	
		}	
		{
			checkBaloncesto = new JCheckBox();
			this.add(checkBaloncesto);
			checkBaloncesto.setText("Baloncesto");
	
	
		}	
		{
			checkTenis = new JCheckBox();
			this.add(checkTenis);
			checkCine.setText("Tenis");
	
	
		}	
		{
			checkNatacion = new JCheckBox();
			this.add(checkNatacion);
			checkNatacion.setText("Natacion");
	
	
		}	

		{
			checkAtletismo = new JCheckBox();
			this.add(checkAtletismo);
			checkAtletismo.setText("Atletismo");
	
	
		}	
	
		{
			checkTeatro = new JCheckBox();
			this.add(checkTeatro);
			checkTeatro.setText("Teatro");
	
	
		}		
		{
			checkCine = new JCheckBox();
			this.add(checkCine);
			checkCine.setText("Cine");
	
	
		}	
	}
}
