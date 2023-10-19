package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*Programa para gestión de productos
1.- Nuevo producto: pide datos y guarda el producto
2.- Bajar precios: pide porcentaje y baja precios de todos los productos
3.- Ordenar productos: ordena productos por precio (de menor a mayor)
4.- Eliminar productos: pide categoría y elimina productos de esa categoría
5.- Subir precios por categoría: pide categoría y porcentaje y sube el precio solo a esa categoría
6.- Mostrar todos los productos: Muestra los datos de todos los productos
7.- Salir

Cada producto se caracteriza por: nombre, precio y categoría*/

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Producto {
private String nombre;
private double precio;
private String categoria;
}