
import java.util.Scanner;

public class NumeroParImpar {
	public static void main(String[] args) {
		
	System.out.println("Ingresa el n�mero");
	Scanner input = new Scanner(System.in);
	int numero = input.nextInt();
	
	/* if(numero % 2 == 0) {
		System.out.println("Es un n�mero par");
	}else {
		System.out.println("Es un n�mero impar");
		} */
	String resultado = (numero % 2 == 0) ? "El numero es par":"El numero es impar";
	System.out.println(resultado);

	}
}
