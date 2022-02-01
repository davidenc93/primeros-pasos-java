import java.util.Scanner;

public class Calculadora {
	public static void main(String []args) {
		Scanner numeros = new Scanner(System.in);
		System.out.println("Porfavor introduce 2 numeros para realizar una operaci�n matem�tica");
		System.out.println("Porfavor introduce el primer n�mero: ");
		double numeroUno = numeros.nextDouble();
		System.out.println("Porfavor introduce el segundo n�mero: ");
		double numeroDos = numeros.nextDouble();
		numeros.nextLine(); //Se limpia el bufer
		
		System.out.println("Indica que operaci�n quieres realizar entre (suma,resta,multiplicaci�n y divisi�n). ");
		String operacion = numeros.nextLine();
		numeros.close();
		
		switch (operacion.toLowerCase()) {
		
		case "suma": 
			System.out.println(numeroUno + numeroDos);
			break;
		case "resta":
			System.out.println(numeroUno + numeroDos);
			break;
		case "multiplicaci�n":
			System.out.println(numeroUno + numeroDos);
			break;
		case "division":
			System.out.println(numeroUno + numeroDos);
			break;
		}						
	}
}

/*
 * Pedir al usuario 2 n�meros por consola y preguntarle que desea realizar
 * 1) Suma
 * 2) Resta
 * 3) Divisi�n
 * 4) Multiplicaci�n
 * 
 * y despues imprimir el resultado
 */

