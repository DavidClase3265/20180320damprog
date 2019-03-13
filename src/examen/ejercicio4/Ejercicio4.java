package examen.ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Ejercicio4 {

		public static void Ejercicio(String cadena){
					Map<Character,Integer> mapa=new HashMap<>();
					
					for(int i=0;i<cadena.length();i++) {
						char caracter=cadena.charAt(i);
						 mapa.put(caracter,i);
						 
					}
					 System.out.println(mapa);	 
		}
		
		
		public static void main(String[] args) {
			Ejercicio("Hola Mundo");

		}

	

}
