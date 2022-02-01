package operadores;

import java.util.Scanner;

public class Multiplicaciones {
	public static void main (String[] args) {
		Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Ingresa cualquier número positivo: ");
        num = console.nextInt();
                
        System.out.println("Tabla de multiplicar de  " + num);
        
        int multiplicador = 1;
        while (multiplicador < 11) {
        	System.out.println(num * multiplicador);
        	multiplicador++;
        }
        
//        int multiplicador = 1;
//        do {
//        	System.out.println(num * multiplicador);
//        	multiplicador++;
//        } while (multiplicador < 11);
        
       for (int i=1; i<11; i++) {
       System.out.println(i + "x" + num + "=" + i*num);	
       }
	}
}

/*Utilizando un bucle while

1.- Crea una nueva clase llamada Tabla
2.- Copia el siguiente codigo y verifica que funcione

	
	import java.util.Scanner;

	public class Table
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Ingresa cualquier número positivo: ");
	        num = console.nextInt();
	                
	        System.out.println("Tabla de multiplicar de  " + num);
	        
	       //Implementa un bucle while que imprima el resultado
	    }
	}	

3.- Debe imprimir la tabla de multiplicar del número en cuestión (solo los primeros 10 números)
 */