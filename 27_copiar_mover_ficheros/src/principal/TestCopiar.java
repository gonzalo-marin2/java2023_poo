package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


public class TestCopiar {

	public static void main(String[] args) throws IOException {
		String dirOrigen="c:\\temp\\origen\\para_copiar.txt";
		String dirDestino="c:\\temp\\destino\\destino_copiar";//hay que poner la dirección del archivo, no de la carpeta
		//Para reemplazar, añadimos REPLACE_EXISTING
		Files.copy(Path.of(dirOrigen), Path.of(dirDestino),StandardCopyOption.REPLACE_EXISTING);
	}

}
