package service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import model.Movimiento;

/*
Clase CuentaMovimientos, hereda de CuentaLimite
* Incorpora un nuevo método, obtenerMovimientos(), que devolverá un arraylist con los movimientos realizados en la cuenta
* Cada movimiento se define por: cantidad, fechaHora y tipo (ingreso o extracción)
*/

public class CuentaMovimientos extends CuentaLimite {
	ArrayList<Movimiento> movimientos=new ArrayList<>();

	public CuentaMovimientos(String codigoCuenta, double saldo, double limite) {
		super(codigoCuenta, saldo,limite);	
	}

	public ArrayList<Movimiento> obtenerMovimientos(){//Obtenemos los movimientos
		return movimientos;
	}

	@Override
	public void extraer(double cantidad) {
		movimientos.add(new Movimiento(cantidad,LocalDateTime.now(), "extracción"));//añadimos los datos de los movimientos
		super.extraer(cantidad);	
	}

	@Override
	public void ingresar(double cantidad) {
		movimientos.add(new Movimiento(cantidad,LocalDateTime.now(), "ingreso"));//añadimos los datos de los movimientos
		super.ingresar(cantidad);
	}
	
	

	
	
	

}
