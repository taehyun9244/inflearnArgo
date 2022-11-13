package programmers.kadai;

import java.util.*;

public class ProgMain {

    public static void main(String[] args) {

        int[][] arr = {
                {6, 2, 1},
                {5, 4, 9},
                {3, 8, 7},
        };

        print(arr);

        int[][] rotateArr;

        System.out.println("\n90");

        // 90 rotate
        rotateArr = rotate(arr, 90);
        print(rotateArr);

        System.out.println("\n180");

        // 180 rotate
        rotateArr = rotate(arr, 180);
        print(rotateArr);

        System.out.println("\n270");

        // 270 rotate
        rotateArr = rotate(arr, 270);
        print(rotateArr);

    }

    static int[][] rotate(int[][] matrix, int degree) {
        HashSet<Integer> array = new HashSet<>();

        int[][] rotate;
        int n = matrix.length;
        int m = matrix[0].length;

        switch (degree) {
            case 90:
            case 270:
                rotate = new int[m][n];
                break;
            case 180:
                rotate = new int[n][m];
                break;
            default:
                throw new IllegalArgumentException();
        }

        for (int i = 0; i < rotate.length; i++) {
            for (int j = 0; j < rotate[i].length; j++) {
                switch (degree) {
                    case 90:
                        rotate[i][j] = matrix[n-1-j][i];
                        break;
                    case 180:
                        rotate[i][j] = matrix[n-1-i][m-1-j];
                        break;
                    case 270:
                        rotate[i][j] = matrix[j][m-1-i];
                        break;
                }
            }
        }

        System.out.println("array = " + array);

        return rotate;
    }

    static void print(int[][] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// for (int i = 0; i < matrix[0].length; i++) {
//        for (int j = 0; j <= matrix[i].length - matrix.length; j++) {
//            array.add(matrix[i][j]);
//        }
//    }
//
//        for (int i = 2; i < matrix[0].length; i++) {
//        for (int j = 1; j < matrix[i].length; j++){
//            array.add(matrix[i][j]);
//        }
//    }
//
//        for (int i = matrix.length -2; i >= 0; i--) {
//        array.add(matrix[i][matrix.length -1]);
//    }
//
//        for ()
//                System.out.println("array = " + array);
//}