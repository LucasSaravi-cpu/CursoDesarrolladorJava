/*c. dado un vector de n�meros, y un n�mero X, que sume todos los n�meros > X y
retorne el resultado
*/

package Clase3;

import java.util.Scanner;

public class Clase3Ejercicio1c {

	public static void main(String[] args) {
		
		int y[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		int resultado = 0;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese el numero x  ");
		int x=entrada.nextInt();
		
		for (int i=0 ; i<y.length ; i++) {    
		
		if (y[i]>x) {
		
		   resultado=resultado+y[i];
     	}
	
	
}
		
		System.out.println("el resultado de la suma de los numeros mayores a x es " + resultado);
		
	}
}