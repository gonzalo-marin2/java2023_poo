package geometria;
/*Hacer 2 clases de figura: triángulo y círculo
 * Atributos de triángulo: base y altura
 * Atributos de círculo: radio*/
public class Triangulo extends Figura {
	private double base;
	private double altura;
	//private int base,altura;así lo tiene Antonio
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	@Override
	public double superficie() {
		//double area=base*altura/2;
		//return area;
		return base*altura/2;
	}
}
