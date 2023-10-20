package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Ciudad;

public class CiudadesService {
	List<Ciudad> ciudades=new ArrayList<>();
	//Recibe los datos de la ciudad y la agrega;
	//no puede haber dos ciudades con mismo nombre y país. Devuelve un boolean informando si se añade o no
	public boolean nuevaCiudad(String nombre, String pais, long habitantes, double temperaturaMedia) {
		if(ciudades.stream().noneMatch(c->c.getNombre().equals(nombre)&&c.getPais().equals(pais))) {
			ciudades.add(new Ciudad(nombre, pais,habitantes,temperaturaMedia));
			return true;
		}
		return false;
	}
	
	//A partir de un país devuelve el total de ciudades de ese país(devuelve la cantidad, no cuáles son)
	public int totalCiudadesPorPais(String pais){
		return (int)ciudades.stream()
				.filter(s->s.getPais().equals(pais))
				.count();
	}
	
	//Devuelve el total de países registrados(devuelve la cantidad, no cuáles son)
	public int totalPaises() {
		return (int)ciudades.stream()//stream<Ciudad>, lo convertimos en entero
				.map(c->c.getPais())//stream <String>, entra un stream de string y sale uno de entero
				.distinct()
				.count();
	}
	
	//A partir de una temperatura media:
	//Indicar si hay alguna ciudad con temperatura media inferior a ese valor.
	//Responde sí o no(true o false)
	public boolean existeCiudadTempInf(double temp) {
		return ciudades.stream()
				.anyMatch(c->c.getTemperaturaMedia()<temp);
	}
	
	//Método que devuelva los datos de la ciudad cuyo nombre se recibe como parámetro
	//Si no la encuentra, que devuelva nulo o una ciudad vacía
	public Ciudad ciudadPorNombre(String nombre) {
		return ciudades.stream()
				.filter(c->c.getNombre().equals(nombre))
				.findFirst()//Optional de ciudad
				.orElse(null);//devuelve una ciudad y si no existe, devuelve null	
	}
	
	//Datos de la ciudad más poblada
	public Ciudad ciudadMasPoblada() {
		return ciudades.stream()
				.max((a,b)->Long.compare(a.getHabitantes(),b.getHabitantes()))//Optional Ciudad
				.orElse(new Ciudad());//proporcionamos una ciudad vacía
	}
	
	//Dado un país, media de habitantes de sus ciudades
	public double mediaHabitantesPorPais(String pais) {
		return ciudades.stream()//stream<Ciudad>
				.filter(c->c.getPais().equals(pais))//stream<Ciudad> filtrado por país
				/*.mapToLong(c->c.getHabitantes())//transformamos a long los habitantes
				.average()//sacamos la media
				.orElse(0);*/
				.collect(Collectors.averagingDouble(c->c.getHabitantes()));
	}
	
	//Temperatura media más alta de entre todas las ciudades
	public double temperaturaMasAlta() {
		return ciudades.stream()//stream<Ciudad>
				.mapToDouble(c->c.getTemperaturaMedia())
				.max()
				.orElse(0);
	}
	
	//A partir de un país devuelve la lista de ciudades de dicho país
	public List<Ciudad> ciudadesPais(String pais){
		return ciudades.stream()
				.filter(c->c.getPais().equals(pais))//Stream<Ciudad>
				.collect(Collectors.toList());
				//.toList() ==> tb valdría, pero ojo, solo a partir de java 16
	}
	
	//Devuelve una lista con los nombres de los países
	public List<String> nombresPaises(){
		return ciudades.stream()
				.map(c->c.getPais())//Stream<String>
				.distinct()//Borramos duplicados
				.collect(Collectors.toList());//Creamos la lista
	}
	
	//Método que devuelva una tabla con las ciudades agrupadas por país
	public Map<String,List<Ciudad>> ciudadesPorPais(){
		return ciudades.stream()
				.collect(Collectors.groupingBy(c->c.getPais()));
				//ciudadesPais.forEach((k,v)->System.out.println(k+"-"+v));		
	}
	
	//Método que,a partir de una temperatura, devuelva una tabla con dos listas de ciudades
	//una, las que tengan una temperatura media superior a ese valor
	//la segunda, las que tienen una temperatura media inferior
	public Map<Boolean,List<Ciudad>> ciudadesPorTemperatura(double temp){
		return ciudades.stream()
				.collect(Collectors.partitioningBy(c->c.getTemperaturaMedia()>temp));
	}
}
