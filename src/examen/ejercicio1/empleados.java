package examen.ejercicio1;

public class empleados implements Interfaz{
	private String nombre;
	private String apellidos;
	private String fecha;
	private int cuenta;
	
	
public empleados(String nombre, String apellidos, String fecha, int cuenta) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.cuenta = cuenta;
	}


public int getCuenta() {
	return cuenta;
}


public void setCuenta(int cuenta) {
	this.cuenta = cuenta;
}


public String getNombre() {
	return nombre;
}


public String getApellidos() {
	return apellidos;
}


public String getFecha() {
	return fecha;
}

public void pago() {
	  
	  System.out.println("Su ingreso es de: ");
}

}
