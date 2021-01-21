package unidad5;

public class Autor {
	String nombre;
	private String email;
	String genero;

	// constructor
	Autor(String nombre, String email, String genero) {
		this.nombre = nombre;
		this.email = email;
		if (genero == "masculino" || genero == "femenino") {
			this.genero = genero;
		}
	}

	// methods Get/Set

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public String getGenero() {
		return genero;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// method toString
	public String toString() {
		return nombre + " (" + genero + ") " + email;
	}

	public static void main(String[] args) {
		Autor reverte = new Autor("Luis Cernuda", "cernuda@gmail.com", "masculino");
		System.out.println(reverte.getNombre());
		System.out.println(reverte.getEmail());
		System.out.println(reverte.getGenero());
		reverte.setEmail("cenurda15@gmail.com");
		System.out.println( reverte.toString() );
		
		
	}

}
