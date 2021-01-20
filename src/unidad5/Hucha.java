package unidad5;

public class Hucha {

	int billete50;
	int billete20;
	int billete10;
	int billete5;
	int moneda2;
	int moneda1;

	String estado = "cerrada";
	int password = 0000;

	// Constructors
	public Hucha() {
		this.billete50 = 0;
		this.billete20 = 0;
		this.billete10 = 0;
		this.billete5 = 0;
		this.moneda2 = 0;
		this.moneda1 = 0;
	}

	public Hucha(int billete50, int billete20, int billete10, int billete5, int moneda2, int moneda1) {
		this.billete50 = billete50;
		this.billete20 = billete20;
		this.billete10 = billete10;
		this.billete5 = billete5;
		this.moneda2 = moneda2;
		this.moneda1 = moneda1;
	}

	public Hucha(int cantidad) {
		if (cantidad >= 50) {
			while (cantidad >= 50) {
				billete50 += 1;
				cantidad -= 50;
			}
		}
		if (cantidad >= 20) {
			while (cantidad >= 20) {
				billete20 += 1;
				cantidad -= 20;
			}
		}
		if (cantidad >= 10) {
			while (cantidad >= 10) {
				billete10 += 1;
				cantidad -= 10;
			}
		}
		if (cantidad >= 5) {
			while (cantidad >= 5) {
				billete5 += 1;
				cantidad -= 5;
			}
		}
		if (cantidad >= 2) {
			while (cantidad >= 2) {
				moneda2 += 1;
				cantidad -= 2;
			}
		}
		if (cantidad >= 1) {
			while (cantidad >= 1) {
				moneda1 += 1;
				cantidad -= 1;
			}
		}
	}

	// methods
	public void cerrar() {
		this.estado = "cerrada";
	}

	public void abrir(int password) {
		if (password == this.password) {
			this.estado = "abierta";
		}
	}

	public String getEstado() {
		return estado;
	}

	public void setpassword(int password) {
		this.password = password;
	}

	public void dinero() {

		System.out.printf("billetes de 50: %d\n", billete50);
		System.out.printf("billetes de 20: %d\n", billete20);
		System.out.printf("billetes de 10: %d\n", billete10);
		System.out.printf("billetes de 5: %d\n", billete5);
		System.out.printf("modedas de 2: %d\n", moneda2);
		System.out.printf("modedas de 1: %d\n", moneda1);
		System.out.printf("dinero total: %d\n\n",
				moneda1 + moneda2 * 2 + billete5 * 5 + billete10 * 10 + billete20 * 20 + billete50 * 50);
	}

	public void retirar( int moneda, int cantidad) {
		if (estado == "abierta") {
			switch (moneda) {
			case 1:
				if (moneda1 < cantidad) {
					moneda1 = 0;
				} else {
					moneda1 -= cantidad;
				}
				break;
			case 2:
				if (moneda2 < cantidad) {
					moneda2 = 0;
				} else {
					moneda2 -= cantidad;
				}
				break;
			case 5:
				if (billete5 < cantidad) {
					billete5 = 0;
				} else {
					billete5 -= cantidad;
				}
				break;
			case 10:
				if (billete10 < cantidad) {
					billete10 = 0;
				} else {
					billete10 -= cantidad;
				}
				break;
			case 20:
				if (billete20 < cantidad) {
					billete20 = 0;
				} else {
					billete20 -= cantidad;
				}
				break;
			case 50:
				if (billete50 < cantidad) {
					billete50 = 0;
				} else {
					billete50 -= cantidad;
				}
				break;
			default:
				System.out.println("Se ha introducido un dato erroneo");
			}
		} else {
			System.out.println("No se puede retirar, la hucha esta cerrada\n");
		}
	}

	public void retirar(int cantidad) {
		if (estado == "abierta") {
			if (cantidad >= 50) {
				while (cantidad >= 50) {
					billete50 -= 1;
					cantidad -= 50;
				}
			}
			if (cantidad >= 20) {
				while (cantidad >= 20) {
					billete20 -= 1;
					cantidad -= 20;
				}
			}
			if (cantidad >= 10) {
				while (cantidad >= 10) {
					billete10 -= 1;
					cantidad -= 10;
				}
			}
			if (cantidad >= 5) {
				while (cantidad >= 5) {
					billete5 -= 1;
					cantidad -= 5;
				}
			}
			if (cantidad >= 2) {
				while (cantidad >= 2) {
					moneda2 -= 1;
					cantidad -= 2;
				}
			}
			if (cantidad >= 1) {
				while (cantidad >= 1) {
					moneda1 -= 1;
					cantidad -= 1;
				}
			}
		} else {
			System.out.println("No se puede retirar, la hucha esta cerrada\n");
		}
	}

}
