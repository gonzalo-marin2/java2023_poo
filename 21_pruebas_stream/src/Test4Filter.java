import java.util.Arrays;
import java.util.List;

public class Test4Filter {

	public static void main(String[] args) {
		//¿Cuántos números pares hay y no están repetidos?
		List<Integer> nums=List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		System.out.println(
				nums.stream()
				.distinct()
				.filter(n->n%2==0)
				.count());
		
		String nombres="leche,atún,vino,patatas,leche,agua,vino,lechuga";
		//¿Cuántos productos de menos de seis caracteres hay?
		System.out.println(Arrays.stream(nombres.split(","))//creamos un stream y ya separado
		.distinct()//creamos un stream
		.filter(s->s.length()<6)//creamos un stream
		.count());
	}

}
