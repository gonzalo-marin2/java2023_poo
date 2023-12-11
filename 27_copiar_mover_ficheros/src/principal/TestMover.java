package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestMover {

	public static void main(String[] args) throws IOException {
		String dirOrigen="c:\\temp\\origen\\para_mover.txt";
		String dirDestino="c:\\temp\\destino\\destino_mover.txt";//hay que poner la dirección del archivo, no de la carpeta
		Files.move(Path.of(dirOrigen), Path.of(dirDestino));

	}

}
