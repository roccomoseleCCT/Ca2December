/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ca2december;

import java.util.Scanner;

/**
 * @author roccomoseleCCT
 */
public class Ca2December {

    public static void main(String[] args) {
        // Task 1: Array Search – Find the First Repeated Element
        //task1();
        // Task 2: Multiplication Table Using 2D Array
        task2();
        
        
    }

    // Task 1: Array Search – Find the First Repeated Element
    public static void task1() {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // User enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare an array with the size given by the user
        int[] arr = new int[size];

        // User enter the elements of the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Iterate through the array to find the first repeated element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // If the element at index i is equal to the element at index j, it's the first repeated element
                if (arr[i] == arr[j]) {
                    System.out.println("First repeated element: " + arr[i]);
                    return;
                }
            }
        }

        // If no repeated elements 
        System.out.println("No repeated elements found.");
    }

    // Task 2: Multiplication Table Using 2D Array
    public static void task2() {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // User enter the size of the multiplication table
        System.out.print("Enter size of multiplication table: ");
        int n = scanner.nextInt();

        // Create a 2D array 
        int[][] table = new int[n][n];

        // Populate the 2D array 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        // Display the multiplication table in matrix form
        System.out.println("Multiplication Table:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print each element followed by a space 
                System.out.print(table[i][j] + "\t");
            }
            // Next line after each row
            System.out.println();
        }
    }
}
