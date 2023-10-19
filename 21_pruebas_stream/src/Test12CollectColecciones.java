import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test12CollectColecciones {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		//Crear una lista con todos los números positivos sin incluir repetidos
		List<Integer> positivos=nums.stream()//Stream<Integer>
				.distinct()//quitamos repetidos
				.filter(n->n>0)//Stream<Integer> solo con positivos
				.collect(Collectors.toList());//creamos la lista; tb existe toSet() si queremos un conjunto
				//.toList();//hace lo mismo que el anterior. Desde Java 16
		
		//Crear un conjunto con todos los números positivos
		Set<Integer> pos=nums.stream()//Stream<Integer>
				.filter(n->n>0)//Stream<Integer> solo con positivos
				.collect(Collectors.toSet());//Creamos el conjunto; al ser un set, no necesitamos distinct(),
				//ya nos evita los duplicados
		
		List<String> empleados=List.of("1112F-Angel","98Q-Ana","223R-Esteban");
		//Generar una tabla donde el código del empleado es la clave y el nombre, el valor
		Map<String,String> emps=empleados.stream()//Stream<String>
				.collect(Collectors.toMap(s->s.split("-")[0], s->s.split("-")[1]));
				//Entran dos datos, pero de salida uno en la clave y otro en valor
				//se puede hacer con un split o con un substring(hasta el guión)
				
	}

}
