package com.company;

import java.util.Random;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[10][15];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Please enter calculation row number from 0-9");
        Scanner scanner = new Scanner(System.in);
        int rowNumber = scanner.nextInt();
        while (rowNumber < 10 && rowNumber >= 0) {
            int rowSum = 0;
            for (int i = rowNumber; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    rowSum = matrix[i][j] + rowSum;

                }
            }
            System.out.println("The " + rowNumber + "nd row's elements sum is " + rowSum);
            break;
        }
    }
}
