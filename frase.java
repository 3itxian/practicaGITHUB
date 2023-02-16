import java.util.Scanner;

public class frase {

	public static void main(String[] args) {
		//Codi de l'Ian Oriol Borbón
		Scanner teclat = new Scanner(System.in);
		String frase;
		int cont=0;
		char lletra;
		
		System.out.println("Introdueix una frase.");
		frase = teclat.nextLine();

		if (frase.length() < 1) {
			System.out.println("La longitud del carácter ha de ser major o igual a 1.");
		}
		else {			
			System.out.println("Introdueix la lletra a canviar.");
			lletra = teclat.next().charAt(0);
			
			for (int i = 0; i < frase.length(); i++){
			    if (lletra == frase.charAt(i)) {
			    	cont++;
			    }	    
			}
			
			if (cont>=1) {
				frase = frase.replace(lletra, '*');
				System.out.println(frase);
			}
			else {
				System.out.println("El caràcter no existeix.");
			}
		}				
	}
}
