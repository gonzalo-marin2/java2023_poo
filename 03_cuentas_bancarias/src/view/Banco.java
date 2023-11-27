package view;

import java.util.ArrayList;

/*Pide el número de cuenta, saldo inicial y el límite después:
1.- Ingresar
2.- Extraer
3.- Saldo y movimientos
4.- Salir*/

import java.util.Scanner;

import model.Movimiento;
import service.CuentaMovimientos;

public class Banco {
	static CuentaMovimientos cuentamov;
	public static void main(String[] args) {
		//pido codigo, saldo, pido límite y creo el objeto CuentaMovimientos
				String codigo;
				double saldo,limite;
				Scanner sc=new Scanner(System.in);
				System.out.println("Introduce codigo de cuenta:");
				codigo=sc.nextLine();
				System.out.println("Introduce saldo:");
				saldo=Double.parseDouble(sc.nextLine());
				System.out.println("Introduce límite:");
				limite=Double.parseDouble(sc.nextLine());
				cuentamov=new CuentaMovimientos(codigo,saldo, limite);
				//ahora viene el rollo menú...
				int opcion;
				do {
					mostrarMenu();
					opcion=sc.nextInt();//lee la opción elegida
					switch(opcion) { //evaluamos
						case 1:
							ingresar();
							break;
						case 2:
							extraer();
							break;
						case 3:
							mostrarMovimientos();
							break;				
						case 4:
							System.out.println("---Adios---");
					}
				}while(opcion!=4);	
			}
			
			//resto de métodos
			static void mostrarMenu() {
				System.out.println("1.- Ingresar dinero");
				System.out.println("2.- Extraer dinero");
				System.out.println("3.- Mostrar movimientos");
				System.out.println("4.- Salir");		
			}
			static void ingresar() {
				Scanner sc=new Scanner(System.in);
				double cantidad;
				System.out.println("Introduce cantidad");
				cantidad=Double.parseDouble(sc.nextLine());
				cuentamov.ingresar(cantidad);
			}
			static void extraer() {
				Scanner sc=new Scanner(System.in);
				double cantidad;
				System.out.println("Introduce cantidad");
				cantidad=Double.parseDouble(sc.nextLine());
				cuentamov.extraer(cantidad);
			}
			static void mostrarMovimientos() {
				ArrayList<Movimiento> movs=cuentamov.obtenerMovimientos();
				for(Movimiento m:movs) {
					System.out.println("Tipo:"+m.getTipo()+" Cantiad:"+m.getCantidad()+" Fecha:"+m.getFechaMovimiento());
				}
				System.out.println("Saldo final: "+cuentamov.getSaldo());
			}
}
