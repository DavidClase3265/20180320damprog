package examen.ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringUtil {
	
	public static int contarLetrasUnicas(String cadena){
	 List<String> lista1=new ArrayList<String>();

	 for(int i; i<cadena.length();i++) {
		char recadena=cadena.charAt(i);
		 lista1.add(recadena);
	 }
	 
	 Iterator<String> i=lista1.iterator();
				 while(i.hasNext()) {
					 String letra=i.next();
					 if(lista1.contains(letra)) {
						 int contador=1;
						 contador++;
						 if(contador>1)
						lista1.remove(letra);
					 }
					 lista1.add(letra);
					 System.out.println();
				 }
				 int resultado=lista1.size();
				 return resultado;
	 }
	 
	
	public static void main(String[] args) {
		System.out.println(contarLetrasUnicas("hola mundo"));

	}
	
}
