package principal;

public class Test {

	public static void main(String[] args) {
		Object ob="Cadena";
		
		String cad=(String)ob;//usamos el casting para devolver una referencia al tipo original de la subclase.Variable tipo padre a variable de tipo hija
		Object oz="300";
		Integer it=(Integer)oz;
		System.out.println(it);//Error, ClassCastException
	}

}
