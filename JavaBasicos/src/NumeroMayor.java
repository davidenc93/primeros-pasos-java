import java.util.Scanner;

public class NumeroMayor {
	public static void main (String[] args) {
		/*
		 Pedir 3 números al usuario y mostrar un mensaje con el
		 número mayor
		  */
		
		System.out.println("Necesito que ingreses tres numeros para analizar cual es el mayor de ellos");
		
		System.out.println("Ingresa el primer numero");
		Scanner numero = new Scanner(System.in);
		int numero1 = numero.nextInt();
		
		System.out.println("Ingresa el segundo numero");
		Scanner numeroDos = new Scanner(System.in);
		int numero2 = numeroDos.nextInt();
		
		System.out.println("Ingresa el tercer numero");
		Scanner numeroTres = new Scanner(System.in);
		int numero3 = numeroTres.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("El numero mayor es " + numero1);
		}else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("El numero mayor es " + numero2);
		}else {
			System.out.println("El numero mayor es " + numero3);
		}
	}
}
