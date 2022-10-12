/*
Un oggetto della classe InsiemeDiStringhe consente di rappresentare un qualunque insieme finito
di stringhe. La classe InsiemeDiStringhe ha il seguente scheletro:
1]class InsiemeDiStringhe {..} variabile che rappresenta l'insieme di stringhe considerato
dall'oggetto.
2] InsiemeDiStringhe(..) costruttore che permette di creare un oggetto che rappresenta l'insieme di
stringhe contenute in un array T.
3] public String stringaLunga() restituisce la stringa di lunghezza massima, se vi sono più stringhe di
lunghezza max ne restituisce una arbitrariamente.
4] public String spaziStringa() restituisce la stringa contenente più spazi
5] public String preStringa() visualizza tutte le stringhe che hanno il prefisso specificato .

 */


import java.util.ArrayList;

public class BasiOOPEsercizio2 {

	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<String>();
		/*
		strings.add("aeds");
		strings.add("aeds o ds");
		strings.add("gi t ne");
		strings.add("p l em v");
		*/
		
		strings.add("\n");
		InsiemeDiStringhe i1 = new InsiemeDiStringhe(strings);
		
		System.out.print(i1.spaziStringa());
		System.out.print(i1.stringaLunga());
		//System.out.println(i1.preStringa("aed"));
		
	}

}
