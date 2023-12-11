package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestLectura {

	public static void main(String[] args) throws IOException {
		String dir="c:\\temp\\productos.txt";
		//Creamos el path
		Path path=Path.of(dir);
		//llamamos al método lines de la clase Files
		Files.lines(path)//devuelve Stream<String>
		.forEach(System.out::println);
	}

}
