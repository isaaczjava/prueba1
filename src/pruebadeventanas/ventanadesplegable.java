package pruebadeventanas;

import javax.swing.JOptionPane;

public class ventanadesplegable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] carreras = {
	            "Ingenier�a en sistemas computacionales",
	            "Ingenier�a industrial",
	            "Ingenier�a en mecatr�nica",
	            "Ingenier�a en informatica",
	            "Ingenier�a petroqu�mica"
	        };
	        String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION, null, carreras, carreras[0]);
	}

}
