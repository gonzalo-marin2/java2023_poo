package principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Curso;

public class Ordenar {

	public static void main(String[] args) {
		List<Curso> cursos=new ArrayList<>(List.of(
				new Curso("Java Básico", 100, LocalDate.of(2023, 11, 20),350),
				new Curso("Spring", 60, LocalDate.of(2023, 10, 11),230),
				new Curso("Angular", 40, LocalDate.of(2023, 10, 11),125),
				new Curso("Hybernate", 30, LocalDate.of(2023, 10, 10),80),
				new Curso("Python", 90, LocalDate.of(2023, 11, 20),160)
				));
		
		/*
		 * Ordenar la lista de cursos por fecha de inicio. En caso de comenzar en la misma fecha,
		 * se ordena por duración
		 * después se muestran todos
		 * */
		
			//cursos.sort((a,b)->a.getFechaInicio().compareTo(b.getFechaInicio()));
			Comparator<Curso> cmp1=(a,b)->a.getFechaInicio().compareTo(b.getFechaInicio());
			Comparator<Curso> cmp2=(a,b)->Integer.compare(a.getDuracion(), b.getDuracion());//Comprobamos cuál es mayor
			//duración es un entero, así comparamos enteros, con Integer.compare()
			//Comparator<Curso> cmpMix=cmp1.thenComparing(cmp2);
			//cursos.sort(cmpMix);
			//para ahorrarnos una variable:
			cursos.sort(cmp1.thenComparing(cmp2));
			cursos.forEach(c->System.out.println(c.getDenominacion()+":"+c.getFechaInicio()));
			//no se puede llamar dos veces a sort, la segunda desordena la primera
	}
}
