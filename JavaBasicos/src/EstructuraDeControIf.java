import java.util.Scanner;

public class EstructuraDeControIf {
	/* */
	public static void main (String[] args) {
		//Estructuras de control de flujo
		//Nos sirve para la toma de decisiones
		/*Estructuras de control de flujo nos sirven para cambiar el flujo de nuestro programa, evaluando una condición y a partir de la evaluación se realiza una acción u otra. */	

		/*if(condicion) {
			codigo
		} else {
			codigo
		}*/
		
		System.out.println("Introduce tu edad"); //Imprimir una linea de texto
		Scanner sc = new Scanner(System.in); // Pide información al usuario
		int edad = sc.nextInt();//Elmacena la información como int en variable edad
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");		
		} else {
			System.out.println("Eres menor de edad");
		}
		
		
		
		
	}
}
