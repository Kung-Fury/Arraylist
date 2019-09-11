// EJERCICIO ARRAYLIST 2

/* Escribir un programa que nos pida una frase, guarde las palabras en un arraylist y nos diga cuantas
 * palabras hay y cual es la m�s larga.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist2 {
	
    public static void main(String args[]) 
    {
    	String aux;
    	String palabra;
    	int longitud;
    	int aux1;
    	int mayor = 0;
    	int index = 0;
       	
    	Scanner sc = new Scanner(System.in); // se crea la variable sc que permite introducir datos por teclado
    	aux=sc.nextLine();
    	List<String> frase = new ArrayList<String>(Arrays.asList(aux.split(" ")));
    	sc.close();
    	
    	// Se muestra la longitud del arraylist que indicar� el n�mero de palabras.
    	System.out.println("El n�mero de palabras de la frase es "+frase.size() + ".");
    	
    	// Se obtiene y se muestra la palabra m�s larga de la frase
    	longitud = frase.size();
    	for (int i = 0; i < longitud; i++) { // Se recorre la frase para determinar la palabra m�s larga
    		palabra = frase.get(i); // Se extrae un elemento de la lista y se pone en una variable String 
    		aux1 = palabra.length(); // Al ser la palabra string, se pude obtener la longitud.
    		if (aux1 > mayor) {
    			mayor = aux1; // Guarda el valor de la palabra m�s larga, es decir el n�mero de letras de la palabra.
    			index = i; // Guarda la posici�n de la palabra m�s larga en la lista.
    		}
    	}
    	System.out.println("La palabra m�s larga es "+frase.get(index) + ".");
    }
}