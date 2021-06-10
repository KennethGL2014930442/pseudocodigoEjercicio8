import java.util.*;

public class ejercicio8{
	
	public static void main(String[] args){
		int opciones;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Desea visualizar los multiplos de 5: 1.Si / 2.No");
		opciones = scanner.nextInt();
		while (opciones == 1){
				System.out.println("Multiplos de 5");
				int numero = (int)(Math.random()*50+1);
				System.out.println(numero*5);
				System.out.println("1. Continuar / 0.salir");
				
				opciones = scanner.nextInt();
		}
	
	}
}
