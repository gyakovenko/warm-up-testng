/**
 *   File Name: AppBasics.java<br>
 *   Yakovenko, Galina<br>
 *   Created: Jan 16, 2017
 *
 */

package com.sqa.gy.helpers;

import java.util.*;

import com.sqa.gy.helpers.exceptions.*;

public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	public static double calcsAverageOfIntsInArray(int[] anArray) {
		int total = calcsTotalOfIntsInArray(anArray);
		double average = (double) total / anArray.length;
		return average;
	}

	public static int calcsTotalOfIntsInArray(int[] anArray) {
		int total = 0;
		for (int i = 0; i < anArray.length; i++) {
			total += anArray[i];
		}
		return total;
	}

	public static void doSomething(String appName, String appActionIng) {
		System.out.println(appName + " App is " + appActionIng);
	}

	public static void farewellUser(String nameOfUser, String appName) {
		System.out.println("\nThanks for using " + appName + ".");
		System.out.println("Bye for now, " + nameOfUser + "!");
	}

	public static String greetUser(String appName) {
		System.out.println("Hello and welcome to the " + appName + " app.");
		System.out.print("What shall I call you? ");
		return scanner.nextLine();
	}

	public static int requestIntFromUser(String question) {
		return requestIntFromUser(question, 0, 0);
	}

	public static int requestIntFromUser(String question, int min, int max) {
		String input;
		int result = 0;
		boolean isNotValid = true;
		while (isNotValid) {
			try {
				System.out.print(question + " ");
				input = scanner.nextLine();
				result = Integer.parseInt(input);
				if (min != 0 && max != 0) {
					if (result < max && result > min) {
						isNotValid = false;
					} else {
						throw new NumberNotInRangeException();
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a correct number value.");
			} catch (NumberNotInRangeException e) {
				System.out.println("You have not entered a number within the range of " + min + " and " + max + ".");
			}
		}
		return result;
	}

	public static String requestUserInfo(String prompt) {
		System.out.print(prompt + " ");
		String response = scanner.nextLine();
		return response;
	}

	public static int requestUserInt(String question) {
		String input;
		int result = 0;
		boolean isNotValid = true;
		while (isNotValid) {
			try {
				System.out.print(question + " ");
				String response = scanner.nextLine();
				result = Integer.parseInt(response);
				isNotValid = false;
			} catch (NumberFormatException e) {
				System.out.print("The value you have entered is invalid. ");
			}
		}
		return result;
	}

	public static boolean requestYesorNo(String prompt) {
		String strYes = "y";
		String response = AppBasics.requestUserInfo(prompt + " (y/n): ");
		return response.equalsIgnoreCase(strYes);
	}

	public static String returnIntArrayAsString(int[] anArray) {
		String arrayInAString = Integer.toString(anArray[0]);
		for (int i = 1; i < anArray.length; i++) {
			{
				arrayInAString = arrayInAString + ", ";
				arrayInAString = arrayInAString + Integer.toString(anArray[i]);
			}
		}
		return arrayInAString;
	}
}
