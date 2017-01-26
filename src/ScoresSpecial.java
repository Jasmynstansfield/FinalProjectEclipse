import java.util.Scanner;

/**
 * ScoresSpecial.java
 * Jasmyn Stansfield
 * Mr. Hardman
 * Final Project
 * January 25th, 2017
 */

public class ScoresSpecial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//allowing user input
		Scanner userInput = new Scanner(System.in);

		//initializing variables
		int[] userArrayA = new int[5];
		int[] userArrayB = new int[5];
		int sumOfSpecialScores;

		System.out.println("Please enter 5 positive integers.");

		//gets array A from the user
		for (int i = 0; i < userArrayA.length; i++) {
			userArrayA[i] = userInput.nextInt();
		}

		System.out.println("Please enter 5 additional positive integers.");

		//gets array B from the user
		for (int j = 0; j < userArrayB.length; j++) {
			userArrayB[j] = userInput.nextInt();

		}

		//method call
		sumOfSpecialScores = scoresSpecial(userArrayA, userArrayB);

		//displays sum of special scores to the user
		System.out.println();
		System.out.println("The sum of the largest special scores in A and B is " + sumOfSpecialScores);

		userInput.close();
	}

	/**
	 * scoresSpecial will find the sum of the largest special score
	 * 
	 * @param a is the first array that we will find the max special score of
	 * @param b is the second array we will find the max special score of
	 * @return the sum of the largest special score of each array
	 */

	public static int scoresSpecial(int[] a, int[] b) {

		//initializing variables
		int sum = 0;
		int maxMultipleA = 0;
		int maxMultipleB = 0;

		//finding the max special score of array A
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 10 == 0 && maxMultipleA < a[i]) {
				maxMultipleA = a[i];

			}

		}

		//finding the max special score of array B
		for (int j = 0; j < b.length; j++) {

			if (b[j] % 10 == 0 && maxMultipleB < b[j]) {
				maxMultipleB = b[j];

			}
		}

		//finding the sum of special scores
		sum = maxMultipleA + maxMultipleB;

		//returning the value to the main method
		return sum;
	}

}
