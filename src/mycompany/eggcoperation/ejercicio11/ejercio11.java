package mycompany.eggcoperation.ejercicio11;
import java.util.Scanner;
public class ejercio11 {

	public static void main(String[] args) {
		char letra;
		String frase,frase2;
		Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingresa una frase");
        
       frase = leer.nextLine();
       n=frase.length();
       while(frase.charAt(n-1)!='.'){
            System.out.println("La frase no finaliza con punto");
            frase = leer.nextLine();
            n=frase.length();
       }
        String re = cambio(frase);
        System.out.println("El cambio "+"" + ""+re); 
	}
        public static String cambio(String frase){
                 String frase2 = null;
                 char letra;
               for (int j = 0; j < frase.length(); j++) {
                    letra = frase.charAt(j);

                    if (letra=='a'|| letra=='A') {
                        letra = '@';
                             }
                    if (letra=='e'|| letra=='E') {
        				letra = '#';
        			}
        			if (letra=='i'|| letra=='I') {
        				letra = '$';
        			}
        			if (letra=='o'|| letra=='O') {
        				letra = '%';
        			}
        			if (letra=='u'|| letra=='U') {
        				letra = '*';
        			}
        			else {
        				frase2 = frase2+letra;
        			}
        		}
        	return frase2;
	}

}
