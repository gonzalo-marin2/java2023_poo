package principal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import service.OperacionesColecciones;

public class Test {

	public static void main(String[] args) {
		// Crear una lista y un conjunto de números enteros
		//y probar el funcionamiento del método sumar()
		ArrayList<Integer> lista=new ArrayList<>();
		lista.add(5);
		lista.add(10);
		lista.add(15);
		lista.add(20);
		
		HashSet<Integer> conjunto=new HashSet<>();
		conjunto.add(3);
		conjunto.add(5);
		conjunto.add(6);
		conjunto.add(9);
		conjunto.add(12);
		conjunto.add(15);
		
		OperacionesColecciones oper=new OperacionesColecciones();//HAY QUE CREAR UN OBJETO DE LA CLASE!!
		System.out.println("Suma lista : "+oper.sumar(lista));
		System.out.println("Suma conjunto : "+oper.sumar(conjunto));
		
		Set<Integer> resultado=oper.subconjunto(lista, conjunto);//oper.subconjunto(lista, conjunto)=>así llamamos al método
		for(Integer in:resultado) {
			System.out.println(in);
		}
	}
	
}
