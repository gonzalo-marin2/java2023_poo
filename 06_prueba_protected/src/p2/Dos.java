package p2;

import p1.Uno;

public class Dos extends Uno{
	public void metodo() {
		//a=3;//no se puede acceder, es private
		//b=5;//no se puede acceder, es default
		c=10;
		d=20;
		Uno uno=new Uno();
		uno.d=40;//en el método, solo podemos acceder a la pública
		//uno.c=40;//no, solo a través de herencia
	}
}
