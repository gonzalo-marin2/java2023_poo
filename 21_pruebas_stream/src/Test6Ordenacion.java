import java.util.List;

public class Test6Ordenacion {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		//¿Cuál es el número más pequeño?
		//lo ordenamos y nos quedamos con el primero
		System.out.println(
				nums.stream()
				.sorted()//sorted sin comparator hace una ordenación natural de menor a mayor
				.findFirst()
				.get());//lo podemos llamar pq al no haber un filtro, hay un valor seguro
		
		//Mostrar los cinco números más altos
		nums.stream()
		.distinct()//ya nos quitamos números para ordenar
		.sorted((a,b)->b-a)//lo ordenamos al revés, de mayor a menor
		//le estamos diciendo, si b mayor que a
		.limit(5)
		.forEach(n->System.out.println(n));
				
		//mostrar los que van adesde la posición 5 a la 10
		int pos1=5;
		int pos2=10;
		nums.stream()
		.skip(pos1-1)//saltamos desde el primer elemento hasta la posición 5
		.limit(pos2-pos1)//recogemos los valores entre ambas posiciones, empezando desde pos1 pero no incluyendo pos2
		.forEach(n->System.out.println(n));
	}

}
