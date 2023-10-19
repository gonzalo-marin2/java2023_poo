package interfaces;

import java.util.Scanner;

/*Crear una interfaz llamada External, que va a definir dos métodos para realizar operaciones con el exterior:
envío de textos y lectura de datos

métodos:
1.- void send(String texto)
2.- String read()*/

public interface External {
	void send(String texto);
	String read();
	//incorporar un método estático que proporcione una implementación por defecto de esta interfaz,
	//con envío de datos a la pantalla y lectura desde el teclado
	static External of() {//devuelve un objeto de tipo External
		return new External() {
			
			@Override
			public void send(String texto) {
				System.out.println(texto);
				
			}
			
			@Override
			public String read() {
				Scanner sc=new Scanner(System.in);
				//String msg=sc.nextLine();
				//return msg;
				return sc.nextLine();
			}
		};
	}
}
