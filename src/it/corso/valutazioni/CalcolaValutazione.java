package it.corso.valutazioni;

public class CalcolaValutazione {
	
	int idUtente;
	int percentualeAssenze;
	double mediaVoti;
	
	CalcolaValutazione(int idUtente, int percentualeAssenze, double mediaVoti){
		this.idUtente = idUtente;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
	}
	
	void valutazione() {
		if(percentualeAssenze > 50) {
			System.out.println("Esito: Bocciato");
		}else if(percentualeAssenze >= 25 && percentualeAssenze <= 50 && mediaVoti > 2.0) {
			System.out.println("Esito: Promosso");
		}else if(percentualeAssenze < 25 && mediaVoti >= 2.0) {
			System.out.println("Esito: Promosso");
		}else {
			System.out.println("Esito: Bocciato");
		}
	
	}
	
}
