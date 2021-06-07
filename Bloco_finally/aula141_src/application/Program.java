
//	--->Seção-15 Aula 141 - Bloco Finally 	--->07/06/2021.

package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Program {

	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("--->Seção-15 Aula 141 - Bloco Finally     ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("*** No PDF tem introdução  *** ");
		System.out.println("---------------------------------------------------------------");
		System.out.println();

		File file = new File("C:\\temp\\in.txt");

		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} 
		finally {
			if (sc != null) {
				sc.close();
			}
		}
		System.out.println("Finally Block Executed");
		System.out.println();

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */
