package Esercizi;

public class Esercizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creazione e Dichiarazione di due variabili di tipo intero.
		// Varie operazioni con le variabili.
		int y = 15;
		int v = 10;
		
		if( y > 10 || v < 10) {
			System.out.println("Benvenuto");
		}
		else {
			System.out.println("A presto");
		}
		
		// Inserimento da Arguments di due valori.
		double numero1 = Double.parseDouble(args[0]);
		double numero2 = Double.parseDouble(args[1]);
		
		System.out.println(numero1);
		System.out.println(numero2);
		
		// somma e divisione di due numeri con la virgola.
		double somma = numero1 + numero2;
		double divisione = numero1 / numero2;
		
		System.out.println(somma);
		System.out.println(divisione);
		
		// Creazione e Dichiarazione di due variabili di tipo stringa.
		String Nome = args[2];
		String Cognome = args[3];
		
		String Nom = "francesco";
		String min = "Ciao".toUpperCase();
		String max = "Ciao".toLowerCase();
		
		System.out.println(Nome);
		System.out.println(Cognome);
		System.out.println(Nom.charAt(8));
		System.out.println(min);
		System.out.println(max);

		
		//Creazione di una variabile booleana e svolgimento.
		boolean Accesa = false;
		
		if(Accesa) {
			System.out.println("E' accesa");
		}
		else {
			System.out.println("E' spenta");
		}
	
		// due cicli annidati.
		for (int i=0; i<2; i++) {
			System.out.println("Sono in un ciclo");
				
				for(int m=0; m<2; m++) {
					System.out.println("Sono in un altro ciclo");
				}
		}
		
		// Ciclo While.
		int I = 0;
		
		while(I < 3) {
			System.out.println("ciaooo");
			I++;
		}
		
		// Ciclo Do While
		int contatore = 0;
		do {
		    System.out.println(contatore);
		    contatore++;
		} while (contatore < 3);
		
		// Creazione di un array e svolgimento di alcune operazioni.
	
		String[] frutta = {"mela", "pera", "banana", "ciliegia", "kiwi"};
	
		
		for(int frutti=0; frutti<frutta.length;frutti++) {
			System.out.println(frutta[frutti]);
			System.out.println(frutta.length);
		}
		
		// Creazione di una frase e poi andare a trovare un'immagine nella frase.
		
		String fraseCompleta = "Francesco ha 30 anni ed è diplomato in Ragioniere Programmatore";
		
		String parola= "diplomato";
		
		String[] arrayParole = fraseCompleta.split(" ");
		
		for(int i=0;i<arrayParole.length;i++) {
			if(arrayParole[i].equals(parola)) {
				System.out.println("La parola trovata è " + parola + " ed è in posizione " + (i + 1));
			}
			
		}
		
		// Creazione di un array di numeri e stampa di ogni indice dell'array.
		
		int[] numeri = {10,20,30,40,50};
		
		for (int k=0;k<numeri.length;k++) {
			System.out.print(numeri[k] + " ");
		}
		
		System.out.println();
		
		
		//Esercitazione di tutti gli argomenti svolti nelle slide fatte
        String s = "ciao";
        System.out.println(s.substring(0, 4));
        
        String s1 = "Francesco ";
        String s2 = "Tedesco";
        String s3 = s1+s2;
        System.out.println(s3);
        String ci = s1.concat(s2);
        System.out.println(ci);
        
        int k = "happy happy birthday".indexOf("y");
        int j = "din din don don".indexOf("don don");
        System.out.println(k);
        System.out.println(j);
        
        String ww = "uno_due_tre".replace("_", "!!!!!");
        System.out.println(ww);
        
        String a1 = "ciao", a2 = "ci"+"ao", a3 = "hello";
        System.out.println(a1 == a2); // potrebbe restituire false
        System.out.println(a1.equals(a2)); // restituisce true
        System.out.println(a1.equals(a3)); // restituisce false
        
        int x = 0;
        int m = 0;
        
        
        if(x>0) {
        	if(m>0) {
        		System.out.print("sono maggiore di 0" );
        	}
        }
        else {
        	System.out.println("sono minori");
        }
        
     
        int g = 0;
        int l = 0;
        int risultato = (g > 0 && l > 0) ? 1 : 0;
        
        String messaggio = (risultato == 1) ? "Sono maggiori di 0" : "Non sono maggiori di 0";
        System.out.println(messaggio);
		
		
		// Inserimento di un numero casuale tramite la proprietà Random e confronto con un array di stringhe.
		 
		int numero = (int) (Math.random()*5);
		
		System.out.println(numero);
		
		String[] saluti = {"CIAO", "HELLO", "OLA", "SALUT", "PRIVET"};
		
		for(int i=0;i<saluti.length;i++) {
			if(i == numero) {
				System.out.println("Il saluto corrispondente è " + saluti[i]);
			}
		}
		
		System.out.println();
		
		// Creazione di un tipo di tabella con due cicli for annidati.
		int N = 10;

		for (int i = 0; i < N; i++) {
		    for (int p = 0; p < N; p++) {
		        if ((i + p) % 2 == 0) {
		            System.out.print("0 ");
		        } else {
		            System.out.print("1 ");
		        }
		    }
		    System.out.println();
		}
		
		
			
		int seme = 1;
		
		switch(seme) {
	    case 1:
	        System.out.println("Luca");
	        break;
	    case 2:
	        System.out.println("Francesco");
	        break;
	    case 3:
	        System.out.println("Andrea");
	        break;
	}
		System.out.println();
		
	
    	final String[] saluto = {"Ciao", "Hello", "Buona sera", "Buon giorno"};
    	final String[] nomi = {"Francesco", "Andrea", "Riccardo", "Enrico"};
    	final String[] cognome = {"Carlino", "Tedesco", "Fiorenza", "Toma"};
    	
    	
    	String A = saluto[(int)(Math.random()*saluto.length)];
    	String B = nomi[(int) (Math.random()*nomi.length)];
    	String C = cognome[(int)(Math.random()*cognome.length)];
    	
    	System.out.println(A + " " + B + " " + C);
    
    	System.out.println();
		
	
		Calcolatrice();
		DatiAnagrafici();
		System.out.println();
		ElencoPersone();
	}
	
	
	public static void Calcolatrice() {
		
		int numero1 = 10;
		int numero2= 8;
		int numero3 = 7;
		
		int somma = numero1 + numero2 + numero3;
		int sottrazione =  numero1 - numero2 - numero3;
		int moltiplicazione =  numero1 * numero2 * numero3;
		int divisione =  numero1 / numero2 / numero3;
		System.out.println("La somma è: " + somma);
		System.out.println("La sottrazione è: " + sottrazione);
		System.out.println("La moltiplicazione è: " + moltiplicazione);
		System.out.println("La divisione è: " + divisione);
		
	}
	
	
	public static void DatiAnagrafici() {
		String Nome = "Francesco";
		String Cognome = "Tedesco";
		String CodiceFiscale = "GFTHNO35E04B936L";
		String Indirizzo = "Via Francesco Ferrari, n° 10";
		
		System.out.println("Il ragazzo si chiama " + Nome + " " + Cognome + " " + "e Vive a Casarano in" + " " + 
				Indirizzo + " " + "e il suo codice fiscale è: " + CodiceFiscale);
	}

	
	public static void ElencoPersone() {
		
		String[] NomePartecipanti = {"Andrea", "Antonio", "Cristian", "Federico", "Francesco", "Giuseppe"};
		int NumeroPartecipanti = 0;
		String[] Nomesquadra = {"SquadraBlue", "SquadraNera", "Squadra Bianca", "SquadraRossa", "SquadraGialla", "SquadraVerde"};
		int NumeroSquadra = 0;
			
		for(int i=0;i<NomePartecipanti.length;i++) {
			NumeroPartecipanti++;
			for(int y=0;y<Nomesquadra.length;y++) {
				if(i == y) {
					System.out.println("Il nome " + NomePartecipanti[i] + " si trova nella squadra " + Nomesquadra[i]);	
				}				
				
			}
			NumeroSquadra++;
			System.out.println("Nella squadra " + Nomesquadra[i] + " ci sono " + NumeroSquadra + " partecipanti");
			NumeroSquadra--;
		}
		System.out.println();
		System.out.println("il numero dei partecipanti è " + NumeroPartecipanti);
		
	
		
		String s = "La risposta alla domanda fondamentale sulla vita, l'universo e tutto quanto è ";
		int v = 42;
		
		String risposta = s+v;
		System.out.println(risposta);		
		
		
		int h = 0;
		System.out.println();
		System.out.println(h);
		System.out.print("h == ");
		String s1 ="Ciao.";
		String s2 ="Come stai?.";
		String s3 = s1+s2;
		System.out.println(s3);
		
		int numero = 10;
		double numeroDecimale = (double) numero;
		System.out.println(numeroDecimale);
		
		
		String[] parole = "Francesco è bello".split(" ");
		
		System.out.println(parole[0]);
		System.out.println(parole[1]);
		System.out.println(parole[2]);
	}
	
}