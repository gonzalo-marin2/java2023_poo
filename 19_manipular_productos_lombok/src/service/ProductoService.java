package service;

/*Programa para gestión de productos
1.- Nuevo producto: pide datos y guarda el producto
2.- Bajar precios: pide porcentaje y baja precios de todos los productos
3.- Ordenar productos: ordena productos por precio (de menor a mayor)
4.- Eliminar productos: pide categoría y elimina productos de esa categoría
5.- Subir precios por categoría: pide categoría y porcentaje y sube el precio solo a esa categoría
6.- Mostrar todos los productos: Muestra los datos de todos los productos
7.- Salir

Cada producto se caracteriza por: nombre, precio y categoría*/

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ProductoService {

	List<Producto> productos=new ArrayList<>();
	
	public void altaProducto(String nombre, double precio, String categoria) {
		productos.add(new Producto(nombre,precio,categoria));
	}
	
	public void bajarPrecio(int porcentaje) {
		//Hay 2 opciones válidas:
		//1:
		productos.replaceAll(p->{
			p.setPrecio(p.getPrecio()*(1-porcentaje/100.0));
			return p;
		});
		//2:
		//productos.forEach(p->p.setPrecio(p.getPrecio()*(1-porcentaje/100.0)));
	}
		
		public void ordenarPorPrecio() {
			productos.sort((a,b)->Double.compare(a.getPrecio(), b.getPrecio()));//Lo convertimos en un double
			//ver clase Double para cotejar sus métodos
	}
		
		public void eliminarPorCategoria(String categoria) {
			productos.removeIf(p->p.getCategoria().equals(categoria));
		}
		
		public void subirPreciosCategoria(int porcentaje, String categoria) {
			productos.replaceAll(p->{
				if(p.getCategoria().equals(categoria)) {
					p.setPrecio(p.getPrecio()*(1+porcentaje/100.0));
				}
				
				return p;
			});
		}
		
		public List<Producto> obtenerProductos(){
			return productos;
		}
		
		
}
	

