package unidad5;

public class Pruebahucha {

	public static void main(String[] args) {
		Hucha cerdito=new Hucha();
		cerdito.dinero();
		Hucha oso=new Hucha(500);
		oso.retirar(100);
		oso.abrir(0000);
		oso.dinero();
		oso.retirar(100);
		oso.dinero();
		oso.retirar(50,2);
		oso.dinero();
		Hucha pez=new Hucha(5,3,2,4,3,21);
		pez.dinero();
		pez.abrir(0000);
		pez.retirar(128);
		pez.dinero();
		pez.cerrar();
		pez.retirar(128);
		pez.dinero();
	}

}
