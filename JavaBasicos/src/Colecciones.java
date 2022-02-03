import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Colecciones {
	public static void main(String[]args) {
		//Las colecciones nos sirven para almacenar un conjunto de objetos
		//La diferencia de las colecciones y los objetos es que las colecciones son dinámicas, pueden cambiar el número de objetos agregados.
		
		// Set tiene 3 implementaciones
		// No puede contener elementos repetidos
		// Los elementos no mantienen un orden
		//HashSet
		
		Set<String> frutas = new TreeSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		// foreach, puede recorrer una colección y en cada recorrido recupera el valor y lo podemos almacenar en una variable 
		//Sintaxis
		//for(tipoDeDatoElemento variable : ele
		for( String fruta : frutas ) {
			System.out.println(fruta);
		}
					
		//TreeSet lo organiza alfabeticamente
		//LinkedHashSet
		
	}
}
