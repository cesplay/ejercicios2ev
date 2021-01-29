package unidad5;

import java.util.ArrayList;

public class Mazo {
	ArrayList<Naipe> cartas = new ArrayList<Naipe>();
	int [] valoresNum;
	//String [] valoresFig;
	
	public Mazo(){
		
		char palo;
		char figura;
		for(int i=0;i<=3;i++) {
			switch(i) {
				case 0:
					palo='t';
					break;
				case 1:
					palo='d';
					break;
				case 2:
					palo='c';
					break;
				case 3:
					palo='p';
					break;
				default:
					palo='E';
			}
			for(int j=2;j<=10;j++) {
				this.cartas.add( new Naipe(palo, j) );
			}
			for(int j=0;j<=3;j++) {
				
				switch(j) {
				case 0:
					figura='A';
					break;
				case 1:
					figura='J';
					break;
				case 2:
					figura='Q';
					break;
				case 3:
					figura='K';
					break;
				default:
					figura='F';
					break;
				}
				this.cartas.add( new Naipe(palo, figura) );
			}
		}
	}
	public Mazo(int barajas, int[] valores) {
		System.out.println("inicio mazo");
		char palo;
		char figura;
		int valor;
		for(int x=0;x<barajas;x++) {
			for(int i=0;i<=3;i++) {
				switch(i) {
					case 0:
						palo='t';
						break;
					case 1:
						palo='d';
						break;
					case 2:
						palo='c';
						break;
					case 3:
						palo='p';
						break;
					default:
						palo='E';
				}
				for(int j=2;j<=10;j++) {
					valor=valores[j-2];
					this.cartas.add( new Naipe(palo,j, valor) );
				}
				for(int j=0;j<=3;j++) {
					
					switch(j) {
					case 0:
						figura='A';
						break;
					case 1:
						figura='J';
						break;
					case 2:
						figura='Q';
						break;
					case 3:
						figura='K';
						break;
					default:
						figura='F';
						break;
					}
					valor=valores[j+9];
					this.cartas.add( new Naipe(palo, figura, valor) );
				}
			}	
		}
		System.out.println("final mazo");
	}
	public Naipe get() {
		int random=(int) (Math.random()*cartas.size()-1);
		return cartas.get(random);
		
	}
	public Naipe remove() {
		int random=(int) Math.random()*cartas.size()-1;
		Naipe aux=cartas.get(random);
		cartas.remove(random);
		return aux;
		
	}
	public void add(char palo, int rango, int valor) {
		cartas.add(new Naipe(palo, valor, rango)) ;
	}
	
	public void addAll(int[] valores) {
		char palo;
		char figura;
		int valor;
		for(int i=0;i<=3;i++) {
			switch(i) {
				case 0:
					palo='t';
					break;
				case 1:
					palo='d';
					break;
				case 2:
					palo='c';
					break;
				case 3:
					palo='p';
					break;
				default:
					palo='E';
			}
			for(int j=2;j<=10;j++) {
				valor=valores[j-2];
				this.cartas.add( new Naipe(palo,j, valor) );
			}
			for(int j=0;j<=3;j++) {
				
				switch(j) {
				case 0:
					figura='A';
					break;
				case 1:
					figura='J';
					break;
				case 2:
					figura='Q';
					break;
				case 3:
					figura='K';
					break;
				default:
					figura='F';
					break;
				}
				valor=valores[j+9];
				this.cartas.add( new Naipe(palo, figura, valor) );
			}
		}	
	}
	public static void main(String[] args) {
		int[] valores= {2, 3, 4, 5, 6, 7, 8, 9,10 ,14 ,11 ,12 ,13};
		Mazo cartaAlta= new Mazo(1,valores);
		Naipe cartaPc;
		Naipe cartaUsu;
		do {
		cartaPc=cartaAlta.get();
		cartaUsu=cartaAlta.get();
		System.out.println("El pc ha sacado un: "+cartaPc.toString());
		System.out.println("Tu has sacado un: "+cartaUsu.toString());
		if(cartaPc.getValor()>cartaUsu.getValor()) 
			System.out.println("Tu pierdes");
		else if(cartaPc.getValor()<cartaUsu.getValor())
			System.out.println("Tu ganas");
		else 
			System.out.println("Empate, repetimos");
		}while(cartaPc.getValor()==cartaUsu.getValor());
		
	}
	
}
