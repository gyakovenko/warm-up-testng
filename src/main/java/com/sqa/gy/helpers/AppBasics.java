/**
 *   File Name: AppBasics.java<br>
 *   Yakovenko, Galina<br>
 *   Created: Jan 16, 2017
 *
 */

package com.sqa.gy.helpers;

import java.util.*;

public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	public static void doSomething(String appName, String appActionIng) {
		System.out.println(appName + " App is " + appActionIng);
	}

	public static void farewellUser(String nameOfUser, String appName) {
		System.out.println("\nThanks for using " + appName + ".");
		System.out.println("Bye for now, " + nameOfUser + "!");
	}

	public static String getUserInfo(String prompt) {
		System.out.print(prompt + " ");
		String response = scanner.nextLine();
		return response;
	}

	public static String greetUser(String appName) {
		System.out.println("Hello and welcome to the " + appName + " app.");
		System.out.print("What shall I call you? ");
		return scanner.nextLine();
	}

	public static void main(String[] args) {
		String appActionIng = "chillin\'";
		String userName;
		String nameOfApp = "Hello World";
		userName = greetUser(nameOfApp);
		doSomething(nameOfApp, appActionIng);

		farewellUser(userName, nameOfApp);
	}

}
