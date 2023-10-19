package principal;

interface Printer{
	void print(String s);
}

//Crear una implementación de la interfaz en la que el método muestre el parámetro por pantalla

//Implementación con expresión Lambda



public class ImplementacionFuncionalLambdas {

	public static void main(String[] args) {
		//La expresión lambda crea un objeto que implementa la interfaz
		//Printer==>interfaz
		//printer==>objeto que implementa la interfaz
		Printer printer=s->System.out.println(s);//desde el igual, equivale a la creación de la clase en la forma clásica
		//Printer printer=(String s)->System.out.println(s);==>se puede poner el tipo de parámetro entre paréntesis
		printer.print("Implementación con lambdas");

	}

}
