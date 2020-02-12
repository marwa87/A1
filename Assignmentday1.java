package com.ss.assignment.service;

public class Assignmentday1 {

	public static void main(String[] args) {

		System.out.println("1)");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}

		System.out.println(".........");

		System.out.println("");
		
		
		

		System.out.println("2)");
		System.out.println("..........");
		System.out.println("");

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= (3 - i); j++) {
				System.out.print("*");

			}
			System.out.println("");
		}

		
		
		
		int[] numOfSpaces = { 5, 4, 3, 2 };// list of number of spaces
		int[] numOfStars = { 1, 3, 5, 7 }; // list of number of stars for j

		System.out.println("3)");
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < numOfSpaces[i]; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < numOfStars[i]; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
		System.out.println("............");

		int[] numOfSpaces2 = { 2, 3, 4, 5 };
		int[] numOfStars2 = { 7, 5, 3, 1 };
		System.out.println("");
		System.out.println("4)");
		System.out.println("............");
		System.out.println("");

		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < numOfSpaces2[i]; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < numOfStars2[i]; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}

	}
}