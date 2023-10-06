package service;

/*clase CuentaLimite
Clase que hereda Cuenta. Incorporará un atributo "limite",
para limitar la extracción a dicho valor.
Dispondrá también de un método ajustarLimite(), que fijará el límite
en la mitad del saldo*/

/*
 Clase CuentaMovimientos, hereda de CuentaLimite
 * Incorpora un nuevo método, obtenerMovimientos(), que devolverá un arraylist con los movimientos realizados en la cuenta
 * Cada movimiento se define por: cantidad, fechaHora y tipo (ingreso o extracción)
 */

public class CuentaLimite extends Cuenta {
	private double limite;
	
	public CuentaLimite(String codigoCuenta, double saldo, double limite) {
		super(codigoCuenta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void ajustarLimite() {
		limite=getSaldo()/2;
	}
	
	@Override
	public void extraer(double cantidad) {
		if(cantidad<=limite) {
			super.extraer(cantidad);
		}else {
			super.extraer(limite);
		}
	}

	/*@Override
	public void ingresar(double cantidad) {
		if(cantidad<=limite) {
			super.ingresar(cantidad);
		}else{
			super.ingresar(limite);
		}	
	}*/
	
}
