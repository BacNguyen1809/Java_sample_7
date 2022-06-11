/*
	* @author bacng
	* @ Date Jun 11, 2022
*/
package exercise.ifElse;

import java.util.Scanner;

public class CheckPassFail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input mark: ");
		int mark = Integer.parseInt(scanner.nextLine());
		if(mark >= 50) {
			System.out.println("PASS");
			
		}else {
			System.out.println("FAIL");
		}
		System.out.println("----------------------");
		System.out.println("CHECK DONE");
	}

}
