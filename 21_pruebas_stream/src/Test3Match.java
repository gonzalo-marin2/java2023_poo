import java.util.List;

public class Test3Match {

//Los métodos match trabajan en cortocircuito, cuando encuentran un dato que casa con el criterio, paran
//Aquí esperaríamos que se imprimiesen los negativos, pero muestra los números hasta que encuentra el primer negativo, termina
	//en ese momento
	
	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,-1,10,8);
		nums.stream()
		.anyMatch(x->{
			System.out.println(x);
			return x<0;
		});
	}

}
