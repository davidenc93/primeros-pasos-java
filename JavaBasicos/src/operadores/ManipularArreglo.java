package operadores;

public class ManipularArreglo {
	public static void main (String[] args) {
		int[] numeros = new int [] { 1, 6, 45, 53, 80, 102, 145, 326, 450, 892 };
		int[] sumas = new int [] {0, 0, 0};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(sumas[0] += numeros[i]);
			if (numeros[i] % 2 == 0) {
				System.out.println(sumas[1] += numeros[i]);	
			} else {
				System.out.println(sumas[2] += numeros[i]);
			}
		}
	}

}
//crea un array con los siguientes n�meros enteros:
//
//1, 6, 45, 53, 80, 102, 145, 326, 450, 892
//Crea un programa que use un ciclo que tome los n�meros de arreglo y devuelva la suma total, la suma de los n�meros pares y la suma de los n�meros impares.
