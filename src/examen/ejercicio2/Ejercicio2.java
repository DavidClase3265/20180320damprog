package examen.ejercicio2;

import java.util.ArrayList;
import java.util.List;

import examen.ejercicio1.asalariados;
import examen.ejercicio1.contratistas;
import examen.ejercicio1.empleados;

public class Ejercicio2 {

	public static void main(String[] args) {

		asalariados as=new asalariados("David", "Villanueva", "13-12-2018", 5);
		contratistas co=new contratistas("Contr1", "Apellido2", "13-12-2019", 9, "S1");
		empleados em=new empleados("Empleado1", "Apellido1", "13-12-2017", 1);
		
		
		em=co;
		 System.out.println(em.getApellidos());
		
		em=as;
		 System.out.println(em.getApellidos());
		
		 List<empleados> lista1=new ArrayList<empleados>();
		 lista1.add(as);
		 lista1.add(co);
		 lista1.add(em);
		 System.out.println(lista1);
	}

}
