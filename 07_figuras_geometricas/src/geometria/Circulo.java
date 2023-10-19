package geometria;
/*Hacer 2 clases de figura: triángulo y círculo
 * Atributos de triángulo: base y altura
 * Atributos de círculo: radio*/
public class Circulo extends Figura{
	private double radio;
	//private double radio;así lo tiene Antonio
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	@Override
	public double superficie() {
		//double area=Math.PI*radio*radio;
		//return area;
		//return Math.PI*radio*radio;
		return Math.PI*Math.pow(radio, 2);//así mejor
	}
}
