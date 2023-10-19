package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * Ciudad: nombre, país, habitantes, tempMedia
 * */

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Ciudad {
	private String nombre;
	private String pais;
	private long habitantes;
	private double temperaturaMedia;
}
