package examen.ejercicio1;

public class empresa implements Interfaz {

	private String nombre;
	private String tipo;
	private int cuenta;
	
	public empresa(String nombre, String tipo, int cuenta) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
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
	public String getTipo() {
		return tipo;
	}
	
	
	  public void pago() {
			  
			  System.out.println("Su ingreso es de: ");
	  }
}
