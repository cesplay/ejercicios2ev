package unidad5;

public class Libro {

	// variables 
	Autor autor;
	String titulo;
	float precio;
	int stock = 5;
	

	// constructors
	public Libro(String titulo, Autor autor, float precio) {
		this.titulo = titulo;
		this.autor=autor;
		this.precio = precio;
	}

	public Libro(String titulo, Autor autor, float precio, int stock) {
		this(titulo, autor, precio);
		this.precio = precio;
		this.stock = stock;
	}

	// methods get/set
	public String getTitulo() {
		return titulo;
	}

	public float getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public String getNombre() {
		return autor.getNombre();
	}

	public String getEmail() {
		return autor.getEmail();
	}

	public String getgenero() {
		return autor.getGenero();
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	// method toString
	public String toString() {
		return titulo + " (" + autor.getNombre()+", "+ autor.getEmail()+", "+autor.getGenero()  + ") " + precio + " € - " + stock + " unidades en stock";
	}

	public static void main(String[] args) {
		Autor perez= new Autor("Perez","perez@gmail.com","masculino");
		Libro principe=new Libro("Principe", perez, 5);
		System.out.println(principe.toString());
		Libro rey=new Libro("Rey", perez, 5, 15);
		System.out.println(rey.toString());
		System.out.println(rey.getNombre());
	}

}
