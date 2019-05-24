package pruebadeventanas;
import javax.swing.JOptionPane; 
public class ventana1 {
	// Declara dos variables numéricas y muestra por pantalla
	//la suma, resta, multiplicación, división y módulo(resto de la división)
public static void main(String[] args) {
	String nombre =JOptionPane.showInputDialog("Ingrese su nombre");
	int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elije una opcion :\n 1.suma \n 2.resta \n" +
				" 3.multiplicacion\n 4.divicion\n 5.resto divicion "));
	if (opcion >=6) {
	JOptionPane.showMessageDialog(null,"Error esa opcion no existe ",null,JOptionPane.ERROR_MESSAGE );
	}else {
	int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer numero"));
	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo numero"));
	int suma=num+num1;
	int resta= num-num1;
	int multi=num*num1;
	double divi=num/num1;
	double modulo=num%num1; // 
	
	switch ( opcion ) {
    case 1:
    	JOptionPane.showMessageDialog(null, nombre +" El resultado de su suma es " + suma , "Suma", JOptionPane.INFORMATION_MESSAGE);
         break;
    case 2:
    	JOptionPane.showMessageDialog(null, nombre +" El resultado de su resta es " + resta , "Resta", JOptionPane.INFORMATION_MESSAGE);
         break;
    case 3:
    	JOptionPane.showMessageDialog(null, nombre +" El resultado de su multiplicacion es " + multi , "Multiplicacion", JOptionPane.INFORMATION_MESSAGE);
         break;
    case 4:
    	JOptionPane.showMessageDialog(null, nombre +" El resultado de su divicion es " + divi , "Divicion", JOptionPane.INFORMATION_MESSAGE);
         break;
    case 5:
    	JOptionPane.showMessageDialog(null, nombre +" El resultado de su modulo es " + modulo , "Modulo", JOptionPane.INFORMATION_MESSAGE);
         break;
    default:
	}
	
}
}
}
