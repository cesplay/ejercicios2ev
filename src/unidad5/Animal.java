package unidad5;

import java.time.LocalDate;

public class Animal {

	private String nombre;
	private LocalDate fecha;
	

	public Animal(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public Animal(String nombre) {
		this.nombre = nombre;
		this.fecha = LocalDate.now();
	}
	
	private int edad(){
		int edad = 0;
		if(fecha.getMonthValue()<LocalDate.now().getMonthValue() || ( fecha.getMonthValue()==LocalDate.now().getMonthValue() && fecha.getDayOfMonth() < LocalDate.now().getDayOfMonth() ) ){
			edad = LocalDate.now().getYear() - fecha.getYear();
			
		}else if((LocalDate.now().getYear()-fecha.getYear())>0)
		{
			edad = LocalDate.now().getYear() - fecha.getYear() - 1;
		}else
		{
			edad=0;
		}
		return edad;
		
	}

	public LocalDate getfecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String toString() {
		
		
		return "Nombre: " + nombre + "-  Edad: " + edad();
	}

}
