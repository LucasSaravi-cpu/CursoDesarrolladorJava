/*Haga una main donde por par�metro env�e la ruta de un archivo. 
Ese archivo debe
contener n�meros. El programa debe escribir por consola la suma de esos n�meros


a. Al programa anterior agreguele un par�metro para que la operaci�n pueda ser
suma o multiplicaci�n.*/


package Clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Clase4Ejercicio2 {

	public static void main(String[] args) throws IOException   {
	int suma=0;
	int multiplicacion=0;
	String archivo = "C:\\Users\\Principal\\Desktop\\Curso Desarrollador de java\\clase 4\\numeros.txt";
    for (String linea:Files.readAllLines(Paths.get(archivo)))
    {   
        int numEntero = Integer.parseInt(linea.trim().replaceAll(" ", ""));
     
        suma= suma+ numEntero;
        multiplicacion=multiplicacion*numEntero;
     
    
    }
    
    
    Scanner entrada=new Scanner(System.in);
	System.out.println("Ingrese si quiere sumar o multiplicar");
	String palabra=entrada.nextLine().toLowerCase();
	


	switch (palabra) {
	
	case "sumar":
    System.out.print("La suma de los numeros son " + suma);
    break;
	case "muttiplicar":
		System.out.print("La multiplicacion de los numeros son " + multiplicacion);	
	break;
	default:
		System.out.println("La palabra ingresada es incorrecta");
		
	}
	
	
	}
}
	
	
	


