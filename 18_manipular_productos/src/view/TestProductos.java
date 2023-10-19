package view;

import service.ProductoService;

public class TestProductos {

	public static void main(String[] args) {
		var prService=new ProductoService();
		//creamos seis productos de prueba en tres categorías
		prService.altaProducto("p1", 10, "cat1");
		prService.altaProducto("p2", 20, "cat2");
		prService.altaProducto("p3", 30, "cat3");
		prService.altaProducto("p4", 40, "cat4");
		prService.altaProducto("p5", 50, "cat5");
		prService.altaProducto("p6", 60, "cat6");
		
		//Bajar 5% a todos
		prService.bajarPrecio(5);
		
		//subir 10% a una categoría
		prService.subirPreciosCategoria(10, "cat1");
		
		//eliminar una categoría
		prService.eliminarPorCategoria("cat2");
		
		//ordenar
		prService.ordenarPorPrecio();
		
		//mostrar todos
		prService.obtenerProductos().forEach(p->
		System.out.println(p.getNombre()+":"+p.getPrecio()+":"+p.getCategoria()));
	}
}
