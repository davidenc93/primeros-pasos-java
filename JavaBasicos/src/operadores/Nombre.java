package operadores;

import java.util.Scanner;

public class Nombre {
	public static void main (String[] args) {
		
		Scanner nombreIngresado = new Scanner (System.in);
		String nombre;
		System.out.println("Por favor ingresa tu nombre");
		nombre = nombreIngresado.nextLine();
		
		for (int i = 0; i < nombre.length(); i++ ) {
			System.out.println(nombre.charAt(i));
		}
	}

}
//Escribe un programa que pida al usuario ingresar su nombre y que entonces imprima cada una de las letras de su nombre.
//
//Ejemplo: "Juan"
//"J"
//"u"
//"a"
//"n"
//
//	Como pista pueden investigar cómo se usan los siguientes métodos de String:
//		length()
//		charAt(i)
	