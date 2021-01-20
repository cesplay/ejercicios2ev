package unidad5;

import java.time.LocalDate;

public class PruebaAnimal {

	public static void main(String[] args) {
		Animal sol = new Animal("Sol");
		System.out.println(sol.toString());
		sol.setNombre("Nico");
		System.out.println(sol.getNombre());
		Animal luna = new Animal("Luna", LocalDate.parse("1998-03-12"));
		System.out.println(luna.toString());
		luna.setFecha(LocalDate.parse("1995-03-12"));
		System.out.println(luna.getFecha());
	}

}
