package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ManipulacionesService {
	//Suma los pares
	/*public int sumaPares(List<Integer> numeros) {
		int suma=0;
		for(Integer in:numeros) {
			if(in%2==0) {
				suma+=in;
			}
		}
		return suma;
	}
	//Suma los positivos de la lista
	public int sumaPositivos(List<Integer> numeros) {
		int suma=0;
		for(Integer in:numeros) {
			if(in>0) {
				suma+=in;
			}
		}
		return suma;
	}*/
	
	//en lugar de hacer métodos para todo, vamos a hacer uno para sumar los números de la colección
	//que cumplan el criterio
	public int sumaCriterio(List<Integer> numeros, Predicate<Integer> criterio) {
		int suma=0;
		for(Integer in:numeros) {
			if(criterio.test(in)) {//quien llame al método tendrá que decir cuál es el criterio
				suma+=in;
			}
		}
		return suma;
	}
	
	//Método que recibe lista de enteros y los imprime
	//Método que recibe lista de enteros y los guarda en un fichero
	//Método que recibe lista de enteros y los manda a la nube
	
	//Vamos a intentar hacer un método que pueda servir para los tres métodos
	public void procesaLista(List<Integer> numeros, Consumer<Integer> consumer){
		for(Integer n:numeros) {
			consumer.accept(n);
		}
	}
	
	//Método que reciba una lista de enteros e imprime los pares
	//Método que reciba un conjunto de enteros y guarda en un fichero los positivos
	//Método que reciba una lista de enteros y manda a la nube los múltiplos de cinco
	public void procesaColeccionPorCriterio(Collection<Integer> numeros, Predicate<Integer> criterio, Consumer<Integer> consumer) {
		for(Integer n:numeros) {
			if(criterio.test(n)) {
				consumer.accept(n);
			}
		}
	}
	
	//Método que reciba una colección enteros y devuelva la suma de los cuadrados de esos números
	//Método que reciba una colección enteros y devuelva la suma de las raíces cúbicas de esos números
	public int sumaTransformacion(Collection<Integer> numeros, UnaryOperator<Integer> fun) {
		int suma=0;
		for(Integer n:numeros) {
			suma+=fun.apply(n);//se acumula el resultadode operar el número
		}
		return suma;
	}

	
	//Método que reciba una colección de cadenas de texto 
	//y devuelva una lista con aquellas que cumplan con el predicado recibido como parámetro
	public List<String> ObtenerCadenasCriterio(Collection<String> cadenas, Predicate<String> criterio){
		List<String> datos= new ArrayList<>();
		for(String s:cadenas) {
			if(criterio.test(s)) {
				datos.add(s);
			}
		}
		return datos;
	}
	
	
}
