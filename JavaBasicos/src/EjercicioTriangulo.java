import java.util.Scanner;

public class EjercicioTriangulo {
	public static void main (String[] args) {
		
		System.out.println("Por favor ingresa los tres �gunlos de tu figura para analizar si es un triangulo o n�.");
		Scanner angulo = new Scanner(System.in);
		int angulo1, angulo2, angulo3;		
		
		System.out.println("Ingresa el primer �ngulo");
		angulo1 = angulo.nextInt();
		System.out.println("Ingresa el segundo �ngulo");
		angulo2 = angulo.nextInt();
		System.out.println("Ingresa el tercer �ngulo");
		angulo3 = angulo.nextInt();
		
		int trianguloResultado = angulo1 + angulo2 + angulo3;
		
		System.out.println(trianguloResultado == 180 
				? "Tus angulos forman un triangulo"
				: "Tus angulos no forman un triangulo");
			
			
		}
		
	}
	//Pedirle 3 �ngulos a un usuario y decirle si es un triangulo v�lido


