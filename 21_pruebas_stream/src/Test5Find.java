import java.util.Arrays;
import java.util.List;

public class Test5Find {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		//¿Cuál es el primer número negativo de la lista?	
		System.out.println(
				nums.stream()
				.filter(n->n<0)//findFirst siempre se acompaña de un primer filtrado
				.findFirst().orElse(null));
				//.findFirst().get());//.get() para que devuelva el valor sin envoltorio.
		//la encapsulación se hace por si no hay ningún valor
		//no se recomienda usar el get(), pq si está vacío, devuelve una excepción
		
		
		String nombres="leche,atún,vino,patatas,leche,agua,vino,lechuga";
		//nombre del primer producto que comience por "a",
		//si no hay ninguno, que muestre un mensaje: "No hay ninguno"
		System.out.println(Arrays.stream(nombres.split(","))//creamos el stream a partir del String
				.filter(s->s.toLowerCase().startsWith("a"))//lo pasamos todo a minúsculas, en este caso no haría falta
				.findFirst()
				.orElse("No hay ninguno"));
	}
}
