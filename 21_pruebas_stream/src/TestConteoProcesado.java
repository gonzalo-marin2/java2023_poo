import java.util.List;

public class TestConteoProcesado {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		//count, forEach son métodos finales
		/*System.out.println(nums.stream().count());//count muestra el número de elementos que hay en la lista
		nums.stream()
		.forEach(n->System.out.println(n));//==>nos muestra los elementos de la lista*/
		//mostrar el contenido de la lista sin duplicados
		nums.stream()
		.distinct()//Stream, es intermedio
		.forEach(n->System.out.println(n+","));
	}

}
