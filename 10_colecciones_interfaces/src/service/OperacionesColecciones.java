package service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* 
 * Crear una clase OperacionesColecciones, que incluya métodos para trabajar con colecciones.
1.- A partir de una colección de números enteros, devuelve la suma de los mismos
2.- Realizar un segundo método que reciba dos colecciones de números y devuelva 
un conjunto con los números contenidos en ambas colecciones(es decir, los números comunes o repetidos en ambas colecciones)
*/

public class OperacionesColecciones {
	
	public int sumar(Collection<Integer> coleccion) {
		int suma=0;
		for(Integer in:coleccion) {
			suma+=in;
		}
		return suma;
	}
	
	public Set<Integer> subconjunto(Collection<Integer> coleccion1, Collection<Integer> coleccion2) {//devolvemos un set que es una interfaz
		Set<Integer> resultado=new HashSet<>();//para iniciar el objeto hay que bajar a la clase
		for(Integer in:coleccion1) {
			if(coleccion2.contains(in)) {
				resultado.add(in);
			}
		}
		return resultado;
	}
}
