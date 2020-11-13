package com.company;

import java.util.Random;
import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[5][5];

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
        System.out.println("———————- MENU —————-\n" +
                "1-For rotating 90*\n" +
                "2-For rotating 180*\n" +
                "3-For rotating 270*\n" +
                "4-For Exit\n" +
                "————————————————");

        Scanner scanner = new Scanner(System.in);
        int menuNumber = scanner.nextInt();
        if (menuNumber < 5) {
            switch (menuNumber) {
                case 1:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[matrix[i].length - j - 1][i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[matrix.length - i - 1][matrix[i].length - j - 1] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[j][matrix.length - i - 1] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("It's the end:)))");
                    break;
                default:
            }
        }else {
            System.out.println("Please enter a valid number");
        }
    }
}
