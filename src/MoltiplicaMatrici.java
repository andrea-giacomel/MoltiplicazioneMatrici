//import java.util.*;

public class MoltiplicaMatrici {
		
	public static void main(String [] args) {
	    
		//definisco la matrice A
		int A[][] = {
	    		{-1, 5, 5},
	    		{-4, 9, 6}, 
	    		{6, -8, 3}
	    };
		//definisco la matrice B
		int B[][] = {
	    		{1, 0, 0}, 
	    		{0, 1, 0},
	    		{0, 0, 1},
	    };
		
		//svolgo il prodotto tra matrici
	    int[][] C = moltiplicaMatrici( A, B);
	    
	    //Stampo a schermo le  matrici
	    System.out.println("Matrice A [" + A.length + "]x[" + A[0].length + "]");
	    stampaMatrice(A);
	    System.out.println("Matrice B [" + B.length + "]x[" + B[0].length + "]");
	    stampaMatrice(B);
	    System.out.println("Matrice C=A*B [" + C.length + "]x[" + C[0].length + "]");
	    stampaMatrice(C);
	}
	
	public static void stampaMatrice(int[][] mat) {
		int numRighe = mat.length;
		int numColonne = mat[0].length;
		
		//per ogni riga
		for (int i = 0; i < numRighe; i++) {
			//per ogni elemento della riga
			for (int j = 0; j < numColonne; j++) {
				//stampo l'elemento
				System.out.printf("%4d " , mat[i][j]);
			}
			//terminata la riga, vado a capo
			System.out.println();
		}
		
		System.out.println();
	}

	public static int[][] moltiplicaMatrici(int a[][], int b[][]) {
		if(a.length == 0) 
			return new int[0][0];	//dimensioni nulle
		if(a[0].length != b.length) 
			return null; //dimensioni non valide
		
		//a[m][n], b[n][p]
		int n = a[0].length;
		int m = a.length;
		int p = b[0].length;
		
		//matrice finale
		int c[][] = new int[m][p];
		
		//per ogni riga della matrice finale
		for(int i = 0; i<m; i++) {
			//per ogni elemento della riga 
			for(int j = 0; j<p; j++) {
				//faccio il prodotto scalare riga di A * colonna di B
				for(int k = 0; k<n; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		return c;
	}
}