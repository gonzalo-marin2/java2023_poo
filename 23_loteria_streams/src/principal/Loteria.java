package principal;

import java.io.IOException;
import java.util.stream.Stream;

public class Loteria {

	public static void main(String[] args) {
		/*Generar 6 números aleatorios entre el 1 y el 49
		  No pueden estar repetidos
		*/
		
		Stream.generate(()->(int)(Math.random()*49+1))//Generamos un stream de Integer
		.distinct()//eliminamos los duplicados
		.limit(6)//nos quedamos con los seis primeros
		.sorted()//los ordenamos
		//.forEach(n->System.out.println(n));//los mostramos
		.forEach(n->System.out.print(n+","));
		//Para ejecutar el programa y no se cierre la consola de comandos
		System.out.println("Pulse tecla para continuar");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
