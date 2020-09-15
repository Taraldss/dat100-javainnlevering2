package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[ ");
		for(int i = 0; i < tabell.length; i++) {
			
			System.out.print(tabell[i] + " ");
		}
			System.out.println("]");

		}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String tabString = "[";
		for(int i = 0; i < tabell.length; i++) {
			
			if(i != tabell.length - 1) {
				
				tabString += Integer.toString(tabell[i]) + ",";
				
			}else {
				tabString += Integer.toString(tabell[i]);
			}
			
		}
		
		tabString += "]";
		
		//Trudde den skulle returnere "[ tabell ]" men fikk feil på jUnit.
		//pasta koden her så dåke ser eg kan ta det med:
		
		//tabString = "\"" + tabString + "\"";
		
		return tabString;
		
	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		Boolean finnesTall = false;
		int i = 0;
		while(finnesTall == false && i < tabell.length) {
			
			if(tall == tabell[i]) {
				finnesTall = true;
			}else {
				finnesTall = false;
			}
			
			i++;
			
		}
		return finnesTall;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int i = 0;
		
		while(i < tabell.length) {
			
			if(tabell[i] == tall) {
				return i;
			}else {
				i++;
			}
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int i = tabell.length - 1;
		int k = 0;
		
		int[] reverseTab = new int[tabell.length];
		
		while(i >= 0 && k < tabell.length) {
			
			reverseTab[k] = tabell[i];
			
			i--;
			k++;
		}
		
		return reverseTab;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
	
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
	
		int nyLengd = tabell1.length + tabell2.length;
		
		int[] nyTab = new int[nyLengd];
		
		int i = 0;
		
		for(int element: tabell1) {
			nyTab[i] = element;
			i++;
		}
		for(int element: tabell2) {
			nyTab[i] = element;
			i++;
		}
		
		return nyTab;
	
	}
}
