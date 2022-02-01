import java.util.Scanner;

public class EstructuraDeControlSwitch {
	public static void main (String[] args ) {
		// Estructuras de control nos sirve para controlar el flujo de comportamiento
		// de un programa. Para la toma de decisiones.
		
		/*
		 switch (condicion_a_evaluar) {
		 	case "valor":
		 		//codigo a ejecutar
		 		//break;
		 	case "n":
		 		//codigo a ejecutar
		 		//break;
		 	default:
		 		//codigo a ejecutar
		 }
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un dia de la semana");
		String dia = sc.nextLine();
		sc.close();
		
//		Comando para comentar en eclipse crt + shift + /
		
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un café");
			break;
		case "martes":
			System.out.println("Lunes chiquito. Esto está cansado, pero ya casi.");
			break;
		case "miercoles":
			System.out.println("Miercoles, pero a que costo");
			break;
		case "jueves":
			System.out.println("Juebebes");
			break;
		case "viernes":
			System.out.println("Viernes al fin");
			break;
		}
		
	}
}
