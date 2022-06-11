/*
	* @author bacng
	* @ Date Jun 11, 2022
*/
package exercise.forLoop;

import java.util.Scanner;

public class HarmonicSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input n");
		int n = Integer.parseInt(scanner.nextLine());
		double sumLeftToRight =printLeftToRightSum(n);
		double sumRightToLeft = printRightToLeftSum(n);

	}
	private static double printLeftToRightSum(int n) {
		double sumLeftToRight =0.0d;
		for(int i = 1;i<= n; i++) {
			sumLeftToRight += (double)(1/i);
		}
		System.out.println("sum left to right "+sumLeftToRight);
		System.out.println();
		return sumLeftToRight;
	}
	private static double printRightToLeftSum(int n) {
		double sumRightToLeft =0.0d;
		for(int i = 1;i<= n; i++) {
			sumRightToLeft += (double)(1/i);
		}
		System.out.println("sum left to right "+sumRightToLeft);
		System.out.println();
		return sumRightToLeft;
	}


}
