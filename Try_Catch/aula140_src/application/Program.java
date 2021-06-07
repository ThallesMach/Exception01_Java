
//	--->Seção-15 Aula 139-140 - Estrutura try-catch 	--->07/06/2021.

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
		System.out.println("--->Seção-15 Aula 139-140 - Estrutura try-catch     ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("*** No PDF tem introdução  *** ");
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		method1();
		
		System.out.println(" End of Program");
		
		}
	
		public static void method1() {
			System.out.println("***METHOD 1 START***");
			
			method2();
			System.out.println("***METHOD 1 END***");
		}
		public static void method2() {
			System.out.println("*** METHOD 2 START ***");
			
			Scanner sc = new Scanner(System.in);
			
			try{
				String[] vect = sc.nextLine().split(" ");
				int position = sc.nextInt();
				System.out.println(vect[position]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(" Invalid position!");
				e.printStackTrace();sc.next();
			}
			catch(InputMismatchException e) {
				System.out.println(" Input error");
			}
			
			sc.close();
			
			System.out.println("***METHOD 2 END***");
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */
