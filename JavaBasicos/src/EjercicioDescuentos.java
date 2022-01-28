import java.util.Scanner;

public class EjercicioDescuentos {
	public static void main (String[] args) {
				
		System.out.println("Por favor ingresa el total de tu compra");
		Scanner totalCompra = new Scanner (System.in);
		
		double totalDeCompra = totalCompra.nextDouble();
		double descuento10 = totalDeCompra * 0.90;
		double descuento20 = totalDeCompra * 0.80;
		double descuento30 = totalDeCompra * 0.70;
		
		if (totalDeCompra <= 1000) {
			System.out.println("No alcanzas el volumen para un descuento tu total a pagar es de " + totalDeCompra);
		} else if (totalDeCompra > 1000 && totalDeCompra <= 4999) {
			System.out.println("Alcanzas un descuento del 10%, tu total a pagar es de " + descuento10);
		} else if (totalDeCompra > 4999 && totalDeCompra <= 9999) {
			System.out.println("Alcanzas un descuento del 20%, tu total a pagar es de " + descuento20);
		} else {
			System.out.println("Alcanzas un descuento del 30%, tu total a pagar es de " + descuento30);
		} 
	}
}

//solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000
		// sila cuenta es de 1001 - 4999 10%
		// si la cuenta es de 500 a 9999 20%
		// si la compra es de 10000 o más 30%



