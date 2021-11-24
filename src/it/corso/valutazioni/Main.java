package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		CalcolaValutazione[] studentiArray = new CalcolaValutazione[20];
		
		Random randomUtenti = new Random();
		
		int idUtente = 0;
		int percentualeAssenze;
		double mediaVoti;
		double max = 5.0D;
		
		for(int i = 0; i < studentiArray.length; i++) {
			idUtente = i + 1;
			percentualeAssenze = randomUtenti.nextInt(100) + 1;
			mediaVoti = randomUtenti.nextDouble() * max;
			studentiArray[i] = new CalcolaValutazione(idUtente, percentualeAssenze, mediaVoti);
			
			
			System.out.print("ID STUDENTE: " + studentiArray[i].idUtente + " - ");
			studentiArray[i].valutazione();
		}
		
	}

}
