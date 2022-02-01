import java.util.Scanner;

public class ScannerYBufer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int numero1 = sc.nextInt();
		sc.nextLine(); //Esto se utiliza para limpiar el Bufer cuando se pasa de numero a string
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		
		sc.close(); //Se utiliza para cerrar el Scanner.
		
		System.out.println("Tu nombre es: " + nombre + "Tu numero es: " + numero1);
		
//		System.out.println("Introduce otro numero");
//		int numero2 = sc.nextInt();
//		
//		System.out.println("Numero 1: " + numero1 + "Numero 2: " + numero2);
	}
}
