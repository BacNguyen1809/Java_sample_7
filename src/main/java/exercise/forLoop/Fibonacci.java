/*
	* @author bacng
	* @ Date Jun 11, 2022
*/
package exercise.forLoop;

public class Fibonacci {
	public static void main(String[] args) {
		int n =1;
		int fnMinus1 =1;
		int fnMinus2 =1;
		int nMax =20;
		int sum = fnMinus1 + fnMinus2;
		double average;
		System.out.println("the Fist "+ nMax +"Fibonacci number are: " );
		while(n<=nMax) {
			System.out.print(fnMinus1 +" "  );
			
			sum = fnMinus1 + fnMinus2;
			fnMinus1 = fnMinus2;
			fnMinus2 = sum;
			++n;
		}
		average = sum/nMax;
		System.out.println("\n the average is "+average);
	}

}
