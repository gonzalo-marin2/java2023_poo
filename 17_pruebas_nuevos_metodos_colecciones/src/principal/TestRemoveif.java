package principal;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveif {

	public static void main(String[] args) {
		//List<Integer> numeros=List.of(7,12,-9,3,-6,4);esta lista es inmutable
		List<Integer> numeros=new ArrayList<>(List.of(7,12,-9,3,-6,4));//ahora sí se puede modificar
		//Eliminar los negativos
		numeros.removeIf(n->n<0);
		numeros.forEach(n->System.out.println(n));

	}

}
