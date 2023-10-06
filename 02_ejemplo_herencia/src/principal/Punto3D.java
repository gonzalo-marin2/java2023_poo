package principal;

public class Punto3D extends Punto {
	private int z;
	public Punto3D(int z) {//se inicializa z pero no x ni y 
		this.z=z;
	}
	
	public Punto3D(int x, int y, int z) {
		//super();//hace una llamada desde la subclase
		super(x,y);//llamamos al constructor de la superclase
		this.z=z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	//Botón derecho>source>Override/Implements methods
	//le estamos diciendo al compilador que estamos sobreescribiendo el método. No es obligatorio pero sí muy conveniente
	@Override
	public void dibujar() {
		super.dibujar();//llama a dibujar() Punto
		System.out.println(","+getZ());//daría lo mismo que lo de abajo
		//System.out.println("Coordenadas: "+getX()+","+getY()+","+getZ());
	}
	
}
