package service;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.Gson;

import model.Empleado;

/*Implementar la lógica de negocio de una aplicación para manejo de empleados

-Obtener lista de empleados por departamento
-Obtener empleado con mayor salario
-Busqueda de empleado por email */

public class EmpleadosService {
	private Stream<Empleado> getEmpleados(){
		String ruta="c:\\temp\\empleados.json";
		Gson gson=new Gson();
		try(FileReader reader=new FileReader(ruta);){
			Empleado[] empleados=gson.fromJson(reader, Empleado[].class);//creamos un array de Empleado
			return Arrays.stream(empleados);//devuelve un Stream<Empleado[]> 
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return Stream.empty();
		}
	}
	
	
	
	public List<Empleado> empleadosPorDepartamento(String departamento){
		return getEmpleados()//tenemos un Stream<Empleado[]>
				.filter(e->e.getDepartamento().equals(departamento))
				.toList();				
	}
	
	public Empleado empleadoMayorSalario() {
		return getEmpleados()
				.max((a,b)->Double.compare(a.getSalario(), b.getSalario()))//Optional<Empleado>
				.orElse(null);
	}
	
	public Empleado buscarEmpleado(String email) {
		return getEmpleados()
				.filter(e->e.getEmail().equals(email))
				.findFirst()//Optional<Empleado>
				.orElse(null);
	}	
}
