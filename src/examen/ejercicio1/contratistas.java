package examen.ejercicio1;

public class contratistas extends empleados {
	private String nombreS;
	private String[] trabajoS;
	
		public contratistas(String nombre, String apellidos, String fecha, int cuenta, String nombreS) {
		super(nombre, apellidos, fecha, cuenta);
			this.nombreS=nombreS;
			this.trabajoS=trabajoS;
	}
		
}
