package operadores;

public class Operadores {
	public static void main (String[] args) {
		//Operadores aritméticos
		//+, -, /, *, %
		int a = 10;
		int b = 20;
		
		int c = a + b; 
		System.out.println(c);
		
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + c);
		
		System.out.println("El resultado de la resta es: " + (b - a));
		
		int division = a / b;
		System.out.println("El resultado de la division es: " + division);
		
		double division2 = (double) a / b;
		System.out.println("El resultado de la división es: " + division2);
		
		double multiplicacion = a * b;
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
		
		double modulo = a % b;
		System.out.println("El resultado del modulo es: " + modulo);
		
		int d = 5, e;//inicializar las variables vacias
		e = 6;
		System.out.println(d + ", " + e);
		
		int f = 0, g = 5;
		
		f+= 5;
		System.out.println(f);
		
		int h = 15, i = 25;
		String j = "Hola";
		
		System.out.println(h > i);
		System.out.println(i != h);
		// System.out.println(h != j);
		
		int k = 0, l = 0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		int operacion = 4 + 5 * 6 / 3;
		System.out.println(operacion);
		
		int x = 0, y = 0;
		int operacion2 = ++x + y--;
		System.out.println(operacion2);
		
		int edad = 18, valor1 = 0;
		
		int resultado = (edad <= 18)? (valor1 = 10) : (valor1 = 0);
		
		System.out.println(resultado);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(true && !false);
		
		
	}
}
