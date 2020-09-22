package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int[] rekke : matrise) {
			
			System.out.print("[");
			
			for(int element : rekke) {
				
				System.out.print(element + " ");
				
			}
			
			System.out.println("]");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String matriseString = "";
		for(int[] rekke : matrise) {
			for(int element : rekke) {
				matriseString += Integer.toString(element) + " ";
			}
			matriseString += "\n";
		}
		//matriseString = "\"" + matriseString + "\"";
		return matriseString;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMat = new int[matrise.length][];
		
		for(int i = 0; i < matrise.length; i++) {
			nyMat[i] = new int[matrise[i].length];
			for(int j = 0; j < matrise[i].length; j++) {

				nyMat[i][j] = matrise[i][j] * tall;
			}
		}
		
		return nyMat;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

			
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[i].length; j++) {
					if(a[j] == b[j]) {
						return true;
					}
				}
			}
		
		return false;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		
		int[][] nyMat = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; i < matrise.length; i++) {
			for( int j = 0; j < matrise[i].length; j++) {
				nyMat[i][j] = matrise[j][i];
				
			}
		}
		
		return nyMat;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int[][] nyMat = new int[a.length][a[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				for(int t = 0; t < a.length; t++) {
					nyMat[i][j] += a[i][t] * b[t][j];
				}
			}
		}
		
		return nyMat;
	
	}
}
