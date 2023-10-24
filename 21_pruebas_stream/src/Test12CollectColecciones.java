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
		
		List<String> empleados2=List.of("ventas-Angel","administracion-Ana","ventas-Esteban",
				"ventas-Javier","informatica-Laura","administracion-Lucas");
		Map<String,List<String>> division=empleados2.stream()//generamos un map desde el stream
				.collect(Collectors.groupingBy(s->s.split("-")[0]));//agrupa los datos con la primera posición
		division.forEach((k,v)->System.out.println(k+":"+v));//recorremos el map para que nos muestre los valores
		/*ventas:[ventas-Angel, ventas-Esteban, ventas-Javier]
			informatica:[informatica-Laura]
			administracion:[administracion-Ana, administracion-Lucas]*/
		/*division.forEach((k,v)->{//de esta forma sale agrupado por departamentos sin repetir el nombre del departamento
			System.out.println(k+": ");
			v.forEach(n->System.out.println(n.split("-")[1]));
		});*/
		
		//Generar un map, a partir de la lista de números, con dos listas, negativos y positivos
		Map<Boolean,List<Integer>> numeros=nums.stream()
				.collect(Collectors.partitioningBy(n->n>0));
		System.out.println(numeros);//output==>{false=[-4, -1, -5, -4], true=[6, 11, 8, 10, 8, 2, 11, 27, 41, 10]}
	}

}
