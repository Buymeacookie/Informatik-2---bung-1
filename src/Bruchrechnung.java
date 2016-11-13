/**
 * 
 * Klasse die einfache Operationen zur Arbeit
 * mit Brüchen zur Verfügung stellt.
 * 
 * @author Niklas Kreutzarek
 *
 */
public class Bruchrechnung {

private int zaehler;
private int nenner;
/**
 * 
 * 
 */
public Bruchrechnung() {
	
zaehler = 1;
nenner =  1;
		
}

/**
 * 
 * 
 * @param zaehler - übergabe eines zaehlers
 * @param nenner - übergabe eines nenners
 */
public Bruchrechnung(int zaehler, int nenner) {

this.zaehler = zaehler;
this.nenner = nenner;
	
}
public int setZaehler(int zaehler) {
	this.zaehler = zaehler;
	
	return zaehler;
	
}

public int setNenner(int nenner) {
	
	this.nenner = nenner;
	
	return nenner;
	
}
	
public int getZaehler() {
	
	System.out.println(zaehler);
	
	return zaehler;
	
}


public int getNenner() {
	
     System.out.println(nenner);	
    
     return nenner;
	
}
/**
 * 
 * @return Gibt den Bruch als String zurück.
 */
public String bruchString() {
	
	System.out.println(zaehler + "/" + nenner);
	return zaehler + "/" + nenner;
}
/**
 * Gibt die Summe zweier Brüche zurück.
 * 
 * @param bruch zweiter Bruch
 */
public void bruchAddition(Bruchrechnung bruch) {

int nennerZwei = bruch.nenner;
int zaehlerZwei = bruch.zaehler;
if (nenner != bruch.nenner) {

    int erweiterung = nennerZwei * nenner; 	

    zaehlerZwei = (erweiterung / nennerZwei) * zaehlerZwei;
    zaehler = (erweiterung / nenner) * zaehler;

    nennerZwei = erweiterung;
    nenner = erweiterung;

    zaehler = zaehler + zaehlerZwei;
    kuerzen();
} 
else {

	zaehler = zaehler + zaehlerZwei;
	kuerzen();
	
}
	
	
}
/**
 * 
 * Berechnet die Differenz zweier Brüche.
 * 
 * @param bruch zweiter Bruch
 */
public void bruchSubtraktion(Bruchrechnung bruch) {
	
	int nennerZwei = bruch.nenner;
	int zaehlerZwei = bruch.zaehler;
	if (nenner != bruch.nenner) {

	    int erweiterung = nennerZwei * nenner; 	

	    zaehlerZwei = (erweiterung / nennerZwei) * zaehlerZwei;
	    zaehler = (erweiterung / nenner) * zaehler;

	    nennerZwei = erweiterung;
	    nenner = erweiterung;

	    zaehler = zaehler - zaehlerZwei;
	    kuerzen();
	} 
	else {

		zaehler = zaehler - zaehlerZwei;
		kuerzen();
		
	}
		
		
	}
/**
 * Berechnet das Produkt zweier Brüche.
 * 
 * @param bruch zweiter Bruch
 * 
 */
public void bruchMultiplikation(Bruchrechnung bruch) {
	int zaehlerZwei = bruch.zaehler;
	int nennerZwei = bruch.nenner;
	
	zaehler *= zaehlerZwei;
	nenner  *= nennerZwei;
	kuerzen();
	
}

/**
 * Berechnet den Quotienten zweier Brüche.
 * 
 * @param bruch zweiter Bruch
 */
public void bruchDivision(Bruchrechnung bruch) {
	int zaehlerZwei = bruch.zaehler;
	int nennerZwei = bruch.nenner;
	
	zaehler *= nennerZwei;
	nenner *= zaehlerZwei;
	kuerzen();
}

/**
 * Berechnet den ggt zweier Zahlen.
 * 
 * @return Gibt den grössten gemeinsamen Teiler aus.
 */

private int ggT() {
  int a = zaehler;
  int b = nenner;
	while (a != b) {
        if (b > a) {
           b = b - a;
         
        }
        else {
            a = a - b;
            
        }
    }
    return a;
}

/**
 * 
 * Kürzen von Zähler und Nenner mithilfe des ggt.
 * 
 */

public void kuerzen() {
	if (zaehler > 0) {
		
		int a = ggT();
		nenner = nenner / a;
		zaehler = zaehler / a;
	} 
	if (zaehler < 0) {
		
		zaehler = zaehler * -1;
		int a = ggT();
		nenner = nenner / a;
		zaehler = zaehler / a;
		zaehler = zaehler * -1;
		
	}
	
	
	
	}
	
}
























