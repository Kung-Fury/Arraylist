// EJERCICIO ARRAYLIST 1

/* Escribir un programa que vaya pidiendo números al usuario entre 1 y 10 y que finalice cuando el usuario 
   introduzca el 0. Que los vaya metiendo en un arraylist  y al finalizar muestre el número de elementos, la suma 
   de todos ellos y  los números que sean pares.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist1 {
	
    public static void main(String args[]) 
    {
    	boolean fin = false;
    	int aux;
    	int aux2;
    	int aux3;
    	int suma = 0;
    	int longitud;
    	ArrayList<Integer> lista = new ArrayList<Integer>();
    	Scanner sc = new Scanner(System.in); // se crea la variable sc que permite introducir datos por teclado
    	while (fin == false) {
    		System.out.print("Introduce número: ");
    		aux=sc.nextInt();
    		if (aux != 0)
    			lista.add(aux);
    		else
    			fin = true;
    	}
    	sc.close();
    	
    	// Primer manera de mostrar datos de la lista.
    	System.out.println("Primera forma de visualizar la lista: " + lista.toString()); 
    	
    	// Segunda manera de mostrar los datos de la lista.
    	System.out.println("Segunda forma de visualizar la lista: "); 
    	for(Integer integer:lista)
             System.out.println(integer);
    	 
    	// Muestra el número de elementos de la lista
    	System.out.println("El número de elementos de la lista es "+lista.size() + ".");
    	
    	// Muestra la suma de todos los elementos de la lista
    	longitud=lista.size();
    	for (int i = 0; i < longitud; i++) {
    		aux2 = lista.get(i);
    		suma += aux2;
    	}
    	System.out.println("La suma de los elementos de la lista es " + suma + "."); 
    	
    	// Muestra todos los elementos pares
    	ArrayList<Integer> listaPares = new ArrayList<Integer>();
    	for (int j = 0; j < longitud; j++) 
    	{
    		aux3 = lista.get(j);
    		if (aux3 % 2 == 0 ) 
    			listaPares.add(aux3);	
    	}
    	System.out.println("Los números pares de la lista son: " + listaPares.toString()); 
    }
}
   