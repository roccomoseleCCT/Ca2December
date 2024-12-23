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
        //task2();
        //Task 3: Diagonal Sum of a Matrix
        //task3();
        //Task 4: Spiral Traversal of a Matrix
        task4();
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

    // Task 3: Diagonal Sum of a Matrix
    public static void task3() {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // User enter the size of the matrix
        System.out.print("Enter size of matrix: ");
        int n = scanner.nextInt();

        // Create a 2D array 
        int[][] matrix = new int[n][n];

        // User enter the elements of the matrix row by row
        System.out.println("Enter elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of the main diagonal and secondary diagonal
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }

        // Display the sums of both diagonals
        System.out.println("Sum of the main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);
    }

    // Task 4: Spiral Traversal of a Matrix
    public static void task4() {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // User enter the dimensions of the matrix (rows and columns)
        System.out.print("Enter rows and columns of matrix: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Create a 2D array
        int[][] matrix = new int[rows][cols];

        // User enter the elements of the matrix row by row
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Call the function to print the spiral order
        printSpiral(matrix, rows, cols);
    }

    // Function to print the matrix in spiral order, receive the matrix and the size
    public static void printSpiral(int[][] matrix, int rows, int cols) {
        // Define the boundaries of the matrix
        int top = 0;
        int left = 0;
        int bottom = rows - 1;
        int right = cols - 1;

        System.out.print("Spiral Traversal: ");

        // Traverse the matrix in spiral order, so from top to bottom and from left to right
        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            // Move down to the next row
            top++; 

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            // Move left to the next column
            right--; 

            // Traverse from right to left along the bottom row 
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                // Move up to the previous row
                bottom--; 
            }

            // Traverse from bottom to top along the left column 
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                // Move right to the next column
                left++; 
            }
        } 
    }
}
