package com.company;

import java.util.Random;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[3][3];

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

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[matrix[i].length-j-1][i] + " ");
            }
            System.out.println();
        }
    }
}
//if i!=j, no result
