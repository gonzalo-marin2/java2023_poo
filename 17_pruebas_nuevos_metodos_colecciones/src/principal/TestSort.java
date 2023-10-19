package principal;

import java.util.ArrayList;
import java.util.List;

public class TestSort {

	public static void main(String[] args) {
		List<Integer> numeros=new ArrayList<>(List.of(7,12,-9,3,-6,4));
		//Ordenar de menor a mayor
		//numeros.sort((a,b)->a>b?1:-1);con esto valdría
		numeros.sort((a,b)->a-b);
		//con la resta,
		//si el primero es más grande que el segundo, devuelve positivo;
		//si da cero, los deja en su posición;
		//si el primero es más pequeño, devuelve positivo
		numeros.forEach(n->System.out.println(n));
		
		//ordenar de mayor a menor
		numeros.sort((a,b)->b-a);
		numeros.forEach(n->System.out.println(n));
		
		//Ordenar alfabéticamente
		List<String> cadenas=new ArrayList<>(List.of("Marcos","Lucas","Laura","Angela","Elena"));
		cadenas.sort((a,b)->a.compareTo(b));//pasamos las cadenas, luego las comparamos
		//cadenas.sort(String::compareTo);
		cadenas.forEach(n->System.out.println(n));
		cadenas.sort((a,b)->a.compareToIgnoreCase(b));//Ignora las mayúsculas
		cadenas.forEach(n->System.out.println(n));
	}

}
