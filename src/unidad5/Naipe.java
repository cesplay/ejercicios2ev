package unidad5;

public class Naipe {
	private String  palo;
	private String rango;
	private int valor;
	private int [] valoresDef= {2, 3, 4, 5, 6, 7, 8, 9,10,1,11,12,13};
	
	//constructores
	public Naipe(char palo, int rango ) {
		switch(palo){
			case 't': 
				this.palo="tréboles";
				break;
			case 'd': 
				this.palo="diamantes";
				break;
			case 'c': 
				this.palo="corazones";
				break;
			case 'p': 
				this.palo="picas";
				break;
			default:
				this.palo="fail";
		}
		this.valor=valoresDef[rango-2];
		this.rango=String.valueOf(rango);
	}
	
	public Naipe(char palo, int rango, int valor ) {
		this(palo, rango);
		this.valor=valor;
	}
	
	public Naipe(char palo, char figura) {
		switch(palo){
			case 't': 
				this.palo="tréboles";
				break;
			case 'd': 
				this.palo="diamantes";
				break;
			case 'c': 
				this.palo="corazones";
				break;
			case 'p': 
				this.palo="picas";
				break;
			default:
				this.palo="fail";
		}
		switch(figura) {
			case 'A':
				rango="Ace";
				this.valor=valoresDef[9];
				break;
			case 'J':
				rango="Jack";
				this.valor=valoresDef[10];
				break;
			case 'Q':
				rango="Queen";
				this.valor=valoresDef[11];
				break;
			case 'K':
				rango="King";
				this.valor=valoresDef[12];
				break;
			default:
				rango="fail";
				break;
		}
	}
	public Naipe(char palo, char figura, int valor ) {
		this(palo, figura);
		this.valor=valor;
	}
	
	public String getPalo() {
		return this.palo;
	}
	public String getRango() {
		return this.rango;
	}
	
	public int getValor() {
		return this.valor;
	}
	public String toString() {
		return rango +" de "+palo;
	}
	public static void showRangos() {
		System.out.println("{\"Ace\", \"2\", \"3\", \"4\", \"5\", \"6\", \"7\", \"8\", \"9\", \"10\", \"Jack\", \"Queen\", \"King\"}");
	}


}
