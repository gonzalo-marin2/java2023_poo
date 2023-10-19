package principal;

interface Datos{
	static void print() {
		System.out.println("Interfaz Datos");
	}
}

class Prueba implements Datos{
	static void print() {
		System.out.println("Clase Prueba");	
	}
}
public class Test {

	public static void main(String[] args) {
		Prueba.print();
		Datos.print();//el método se utiliza desde la interfaz y no desde la clase

	}

}
