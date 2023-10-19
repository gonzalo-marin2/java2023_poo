import java.util.Arrays;

public class Test11FlatMap {

	public static void main(String[] args) {
		String[][] pedidos= {{"azucar","agua","vino","azucar"},//hay dos corchetes pq es bidimensional
				{"cerveza","pollo","jamon","vino"},
				{"agua","aceite","pan","jamon","lechuga"}};
		
		//¿Cuántos productos se han pedido entre todas las tiendas?
		System.out.println(
				Arrays.stream(pedidos)//stream<String[]> generamos el stream desde el array  
				.flatMap(a->Arrays.stream(a))//generamos un stream de string==>ha convertido todo en un array unidimensional,
				//en un array de cadenas
				.distinct()
				.count());
		
		/*
		 List<List<List<Integer>>> nums;
		 Haríamos tantos flatMap como fuesen necesarios, bajando niveles
		 nums.stream()Stream<List<List>>
		 .flatMap(l->l.stream())Stream<List>
		 .flatMap(l->l.stream())Stream<Integer>
		 */
		
	}
}
