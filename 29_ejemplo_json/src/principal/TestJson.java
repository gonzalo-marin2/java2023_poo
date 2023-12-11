package principal;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Pedido;
import serializacion.DeserializadorFecha;

public class TestJson {

	public static void main(String[] args) {
		//Leer los datos del pedido que se encuentra en el archivo .json y mostrarlos
		//usaremos librería gson
		String ruta="c:\\temp\\pedidos.json";
		//creamos un objeto de esta nueva clase
		//Gson gson=new Gson();hay que crear el gson de otra forma para poder usar la fecha localdate
		//a las siguientes líneas de código se les llama Patrón Builder
		Gson gson=new GsonBuilder()
				.registerTypeAdapter(LocalDate.class, new DeserializadorFecha())//GsonBuilder
				.create();//creamos el GsonBuilder con las propiedades descritas en la línea anterior
		//primer parámetro: la ruta; segundo, la clase a la que hay que convertir.Hay que crear un objeto de la clase Class
		try(FileReader reader=new FileReader(ruta);){//hemos tenido que crear este objeto
			//si tuviera un único archivo: Pedido pedidos=gson.fromJson(reader, Pedido.class);y no necesitaríamos el bucle for
			Pedido[] pedidos=gson.fromJson(reader, Pedido[].class);//cuando el archivo tiene más de un elemento
			for(Pedido pedido:pedidos) {
				System.out.println("Producto: "+pedido.getProducto());
				System.out.println("Fecha: "+pedido.getFechaPedido());
				System.out.println("Precio: "+pedido.getPrecio());
			}
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
			
	}

}
