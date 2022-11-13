package programmers.kadai;

import java.util.HashSet;

public class Project1 {
        private static int[][] solution(int[][] matrix, int r) {
            int count = r%4; //1=90도, 2=180도 , 3=270도 , 4=360도, 5->1, 6->2, 7->3 8->4

            //count 만큼 회전 시키기 위한 반복문
            for (int d = 0; d < count; d++) {
                //rotate() 회전시키는 기능을 담당하는 기능
                matrix = rotate(matrix);
            }

            return matrix;
        }

        //90도 회전 기능
        public static int[][] rotate(int[][] matrix){
            int m = matrix[0].length; //col
            int n = matrix.length;    //row

            //2차원 배열 생성
            int[][] arry = new int[m][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arry[j][n - 1 - i] = matrix[i][j];
                }
            }
            return arry;
        }

        //출력 기능
        static void print(int[][] arr) {
            for (int i=0; i<arr.length; i++) {
                for (int j=0; j<arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
        }

        public static void main(String[] args) {
            int[][] matrix = {{6, 2, 1}, {5, 4, 9}, {3, 8, 7}};
            int[][] result;
            int degree = 1; //회전 횟수 입력

            result = solution(matrix, 1);
            print(result);
        }
}
