package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import service.ManipulacionesService;
//Sustituimpos todas estas clases por expresiones lambdas

/*class CriterioPares implements Predicate<Integer>{//CREAMOS UNA CLASE QUE IMPLEMENTE LA INTERFAZ PREDICATE

	@Override
	public boolean test(Integer t) {
		return t%2==0;
	}
	
}*/

/*class CriterioNegativos implements Predicate<Integer> {//CREAMOS UNA CLASE QUE IMPLEMENTE LA INTERFAZ PREDICATE

	@Override
	public boolean test(Integer t) {
		return t<0;
	}
	
}*/

/*class CriterioImpares implements Predicate<Integer>{//CREAMOS UNA CLASE QUE IMPLEMENTE LA INTERFAZ PREDICATE

	@Override
	public boolean test(Integer t) {
		return t%2!=0;
	}
	
}*/

/*class GuardaFichero implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		try(FileOutputStream fos=new FileOutputStream("c:\\temp\\numeros.txt");
				PrintStream out=new PrintStream(fos)){
			out.println(t);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}	
}*/

/*class CriterioLongitud implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.length()>5;
	}
	
}*/

public class OperaNumeros {

	public static void main(String[] args) {
		List<Integer> numeros=List.of(-5,7,11,4,2,-1,10,8);
		//Utilizando ManipulacionesService:
		//Mostrar la suma de los pares por un lado, y la de los negativos por otro 
		ManipulacionesService service=new ManipulacionesService();
		//System.out.println("Suma pares: "+service.sumaCriterio(numeros, new CriterioPares()));//PASAMOS EL OBJETO DE LA CLASE COMO SEGUNDO PARÁMETRO
		//System.out.println("Suma negativos: "+service.sumaCriterio(numeros, new CriterioNegativos()));//PASAMOS EL OBJETO DE LA CLASE COMO SEGUNDO PARÁMETRO
		//System.out.println("Suma impares: "+service.sumaCriterio(numeros, new CriterioImpares()));//PASAMOS EL OBJETO DE LA CLASE COMO SEGUNDO PARÁMETRO
		
		//Suma de los pares:
		System.out.println("Suma pares: "+service.sumaCriterio(numeros, x->x%2==0));
		//Suma de los negativos
		System.out.println("Suma negativos: "+service.sumaCriterio(numeros, x->x<0));
		//Suma de los impares
		System.out.println("Suma impares: "+service.sumaCriterio(numeros, x->x%2!=0));
						
		//Guardar en un fichero (de dirección cualquiera) los negativos
		//service.procesaColeccionPorCriterio(numeros, new CriterioNegativos(), new GuardaFichero());
		//Guardar un fichero
		service.procesaColeccionPorCriterio(numeros, x->x<0,t->{
			try(FileOutputStream fos=new FileOutputStream("c:\\temp\\numeros.txt");
					PrintStream out=new PrintStream(fos)){
				out.println(t);
			}
			catch(IOException e) {
				e.printStackTrace();
			}	
		});
		
		List<String> nombres=List.of("pan","cadenalarga","vino","bicicleta");
		//List<String> res=service.ObtenerCadenasCriterio(nombres, new CriterioLongitud());
		List<String> res=service.ObtenerCadenasCriterio(nombres, x->x.length()>5);
		System.out.println(res);
	}	
}
