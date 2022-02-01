package operadores;

public class Ciclos {
	public static void main(String[] args) {
		//while
		int control = 0;
		
//		while(control < 10) {
//			System.out.println("Control = " + control);
//			control++;
//		}
		
		//do while
		
		do{
			System.out.println("Control = " + control);
			//modificador de la variable control
			control++;
		}while(control < 3);
		
		//for
//		for(int i = 0; i < 3; i++) {
//			System.out.println("Control = " + i);
//
//		}
		//break & continue
//		for(int i = 0; i < 3; i++) {
//			if(i % 2 == 0) {
//				System.out.println("Control = " + i);
//				break;
//			}
//			System.out.println("Control = " + i);
//		}
		
		for(int i = 0; i < 3; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println("Control = " + i);
		}
		for(int i = 0; i < 3; i++) {
			System.out.println("Control = " + i);
			continue;
			
		}
	}
}
