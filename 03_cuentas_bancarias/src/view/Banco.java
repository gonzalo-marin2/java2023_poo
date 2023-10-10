package view;

/*Pide el número de cuenta, saldo inicial y el límite después:
1.- Ingresar
2.- Extraer
3.- Saldo y movimientos
4.- Salir*/

import java.util.Scanner;

import service.Cuenta;
import service.CuentaLimite;
import service.CuentaMovimientos;

public class Banco {
	static CuentaMovimientos cuentamov;
	public static void main(String[] args) {
		String codigo;
		double saldo,limite;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu código de cuenta: ");
		codigo=sc.nextLine();
		System.out.println("Por favor, introduce tu saldo inicial: ");
		saldo=sc.nextDouble();
		System.out.println("Por favor, introduce el límite: ");
		limite=sc.nextDouble();
		
		int opcion;
		do {	
				mostrarMenu();
				opcion=sc.nextInt();
				switch(opcion) {
				case 1:
					System.out.println("Introduce la cantidad a ingresar");
					cuenta.ingresar(sc.nextDouble());
					System.out.println("Tu saldo actual es de: "+cuenta.getSaldo());
					break;
				case 2:
					System.out.println("Introduce la cantidad que quieres extraer");
					cuentaLimite.extraer(sc.nextDouble());
					System.out.println("Tu saldo actual es de: "+cuentaLimite.getSaldo());
					break;
				case 3:
					//mostrarSaldo();
					break;
				
				case 4:
					System.out.println("Gracias por fiarnos tu dinero");
				}			
			
		}
		while(opcion!=4);
	}
	
	static void mostrarMenu() {
		System.out.println("1.Ingresar");
		System.out.println("2.Extraer");
		System.out.println("3.Mostrar saldo y últimos movimientos");
		System.out.println("4.Salir");	
	}
	
	static void ingresar() {
		
	}
	
	static void extraer() {
		
	}
	
	static void mostrarMovimientos() {
		
	}

}
