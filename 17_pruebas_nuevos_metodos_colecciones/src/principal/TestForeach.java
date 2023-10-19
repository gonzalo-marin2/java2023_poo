package principal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestForeach {

	public static void main(String[] args) {
		List<Integer> numeros=List.of(7,12,9,3,6,4);
		/*for(Integer n:numeros) {
			System.out.println(n);
		}*/
		//En lugar de hacer lo anterior, hacemos:
		numeros.forEach(n->System.out.println(n));//esto es programación funcional
		//se puede sustituir por:
		//numeros.forEach(System.out::println);
		//forEach tb está implementado en Map y en Set
		
		//Datos del ejercicio 31 básicos
		Map<Integer, String> dias=new HashMap<>();
		dias.put(125, "lunes");//Introducimos los valores
		dias.put(300, "martes");
		dias.put(400, "miércoles");
		dias.put(200, "jueves");
		dias.forEach((k,v)->System.out.println(k+":"+v));
	}

}
