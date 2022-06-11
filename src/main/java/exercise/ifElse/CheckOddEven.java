/*
	* @author bacng
	* @ Date Jun 11, 2022
*/
package exercise.ifElse;

import java.util.Scanner;

public class CheckOddEven {
	private boolean CheckOdd(int number) {
		return (number%2 != 0);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CheckOddEven check = new CheckOddEven();
		System.out.println("Input number check: ");
		int number = Integer.parseInt(scanner.nextLine());
		System.out.println("the number is: "+ number);
		if(check.CheckOdd(number) == true) {
			System.out.println("Odd number");
		}else {
			System.out.println("Even number");
		}
		System.out.println("*******************");
		System.out.println("Bye");
	}

}
