import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test8Map {

	public static void main(String[] args) {
		String nombres="leche atún,vino,patatas,mantequilla-ajo,arroz,lechuga";
		//mostrar las longitudes de cada texto, de menor a mayor
		Arrays.stream(nombres.split("[, -]"))//stream de cadenas. Utiliza como separador la coma, el espacio o el guión
		.map(s->s.length())//transformamos un stream de cadenas en un stream de enteros
		.sorted()
		.forEach(n->System.out.println(n));
		
		
		//mostrar el total de caracteres de todos los productos, sin contar los repetidos
		System.out.println("Esta es la suma: "+
				Arrays.stream(nombres.split("[, -]"))//Stream<string>, hemos creado una cadena sin espacios ni comas ni guiones
				.distinct()//Stream<string>, borramos los repetidos
				/*.mapToInt(s->s.length())//IntStream, transformamos los string en enteros
				.sum());*/
				.collect(Collectors.summingInt(s->s.length())));
		
		//Método para sacar la media
		List<Integer> nums=List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		System.out.println("Esta es la media: "+
				nums.stream()//Stream de enteros
				//.distinct()//Stream de enteros sin repetidos. Si no especifica, no hace falta usarlo
				.filter(n->n>0)//stream<Integer> positivos
				/*.mapToInt(n->n)//Genera un IntStream, hay que transformarlo
				.average()
				.orElse(0)
				);*/
				.collect(Collectors.averagingDouble(n->n)));//llamando a collector nos ahorramos las tres líneas anteriores

	}

}
