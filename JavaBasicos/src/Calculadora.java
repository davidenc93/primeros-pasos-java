import java.util.Scanner;

public class Calculadora {
	public static void main(String []args) {
		Scanner numeros = new Scanner(System.in);
		System.out.println("Porfavor introduce 2 numeros para realizar una operación matemática");
		System.out.println("Porfavor introduce el primer número: ");
		double numeroUno = numeros.nextDouble();
		System.out.println("Porfavor introduce el segundo número: ");
		double numeroDos = numeros.nextDouble();
		numeros.nextLine(); //Se limpia el bufer
		
		System.out.println("Indica que operación quieres realizar entre (suma,resta,multiplicación y división). ");
		String operacion = numeros.nextLine();
		numeros.close();
		
		switch (operacion.toLowerCase()) {
		
		case "suma": 
			System.out.println(numeroUno + numeroDos);
			break;
		case "resta":
			System.out.println(numeroUno + numeroDos);
			break;
		case "multiplicación":
			System.out.println(numeroUno + numeroDos);
			break;
		case "division":
			System.out.println(numeroUno + numeroDos);
			break;
		}						
	}
}

/*
 * Pedir al usuario 2 números por consola y preguntarle que desea realizar
 * 1) Suma
 * 2) Resta
 * 3) División
 * 4) Multiplicación
 * 
 * y despues imprimir el resultado
 */

