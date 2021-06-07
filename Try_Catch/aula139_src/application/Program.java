
//	--->Seção-15 Aula 139 - Estrutura try-catch 	--->07/06/2021.

package application;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Program {

	
	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("--->Seção-15 Aula 139 - Estrutura try-catch     ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("*** No PDF tem introdução  *** ");
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		}
		catch (InputMismatchException e) {
			System.out.println("Input error ");
		}
		System.out.println("*** End of Program ");
		

		sc.close();
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */
