package geometria;
/*Hacer 2 clases de figura: triángulo y círculo
 * Atributos de triángulo: base y altura
 * Atributos de círculo: radio*/
public abstract class Figura {
	private String color;

	public Figura(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double superficie();
}
