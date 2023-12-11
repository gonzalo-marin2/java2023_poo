package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TestEscritura {

	public static void main(String[] args) throws IOException {
		//podríamos haber puesto: public static void main(String[] args throws IOException) y nos ahorramos el try/catch
		String dir="c:\\temp\\productos.txt";
		List<String> lst=List.of("pan","agua","filete","pizza","fanta");
		//guardar productos en el fichero
		//primero, necesitamos el path
		Path path=Path.of(dir);
		//llamamos al método write de la clase Files y le pasamos el path y la lista como parámetros
			Files.write(path, lst);//==>hay que poner un bloque try/catch o como se ha declarado arriba
		//guardamos uno nuevo
		//Files.writeString(path, "cerveza");//hemos machacado lo anterior, para evitarlo:
		Files.writeString(path, "cerveza",StandardOpenOption.APPEND);
		
	}

}
