package pruebas;

public class Operaciones {
	//constructor por defecto. Lo crea Java si la clase no tiene constructores especídficos
	
	public int sum(String s, int ... numeros) {
		//para el interior del método, lo que hay dentro es un array
		/*public Operacines() {
			
		}*/
		
		//al ser privado, no se puede acceder a él, sería como una clase sin constructores
		private Operaciones() {
			
		}
		
		int suma=0;
		for(int num:numeros) {//lo tratamos como un array 
			suma+=num;
		}
		return suma;
	
	//este es el orden de precedencia
	
	public int multi(int s) {
		return 10;
	}
	
	public int multi(long k) {
		return 100;
	}
	
	public int multi(Integer n) {
		return 40;
	}
	
	public int multi(int ...datos) {
		return 30;
	}
	
	
	//sobrecarga no válida
	public int div(int ...is nums) {
		return 200;
	}
	
	public int div(int[] valores) {
		return 300;
		}

	
	}
	
}
