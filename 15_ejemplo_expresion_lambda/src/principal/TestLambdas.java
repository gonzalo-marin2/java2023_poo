package principal;

import java.util.function.BiPredicate;

public class TestLambdas {

	public static void main(String[] args) {
		//Mediante expresión lambda, crear una implementación de BiPredicate<Integer,Integer>, que devuelva true
		//solo cuando los números sean iguales

		/*BiPredicate<Integer,Integer> impl1=(int a, int b)->{
								if(a==b){
								return true;
							} else {
								return false;
							}*/


		//SOLUCIÓN
		BiPredicate<Integer,Integer> impl1=(a,b)->a==b;

		//*** EJERCICIO 2 ***
		//Otra implementación de BiPredicate que devuelva true solo si ambos son positivos:

		//BiPredicate<Integer,Integer> impl2=(a,b)->{a>0 && b>0}

		//SOLUCIÓN
		BiPredicate<Integer,Integer> impl2=(a,b)->a>0&&b>0;


		//*** EJERCICIO 3 ***
		//Partiendo de las implementaciones anteriores, crear una implementación que devuelva true si ambos números
		//son positivos e iguales

		//BiPredicate<Integer,Integer> impl3=(a,b)->(a>0&&b>0)&&a==b;==>sería correcto
		BiPredicate<Integer,Integer> impl3=impl1.and(impl2);//aplicamos el método and de bipredicate
		//Prueba
		System.out.println(impl3.test(2, 3));
		System.out.println(impl3.test(5, 5));

	}

}
