package service;

import model.Movimiento;

/*
Clase CuentaMovimientos, hereda de CuentaLimite
* Incorpora un nuevo método, obtenerMovimientos(), que devolverá un arraylist con los movimientos realizados en la cuenta
* Cada movimiento se define por: cantidad, fechaHora y tipo (ingreso o extracción)
*/

public class CuentaMovimientos extends CuentaLimite {

	public CuentaMovimientos(String codigoCuenta, double saldo, double limite, Movimiento(new Movimiento(cantidad,fechaMovimiento,tipo))) {
		super(codigoCuenta, saldo,limite);
		
	}

}
