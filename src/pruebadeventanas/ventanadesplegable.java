package pruebadeventanas;

import javax.swing.JOptionPane;

public class ventanadesplegable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] carreras = {
	            "Ingeniería en sistemas computacionales",
	            "Ingeniería industrial",
	            "Ingeniería en mecatrónica",
	            "Ingeniería en informatica",
	            "Ingeniería petroquímica"
	        };
	        String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION, null, carreras, carreras[0]);
	}

}
