package model;
/*
 * Curso:
-denominación->texto
-duración->entero
-fechaInicio->campo de fecha(sin hora)
-precio->doble*/

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Curso {
	private String denominacion;
	private int duracion;
	private LocalDate fechaInicio;
	private double precio;
}
