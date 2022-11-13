package programmers.kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * ## 問4
 * N x Nの2次元配列があります。
 * matrix = [
 * [6, 2, 1], matrix[0][0], matrix[0][1], matrix[0][2]
 * [5, 4, 9], matrix[1][0], matrix[1][1], matrix[1][2]
 * [3, 8, 7], matrix[2][0], matrix[2][1], matrix[2][2]
 * ]
 * getSpiralPath(matrix) // -> [6, 5, 3, 8, 7, 9, 1, 2, 4] を返却
 */
public class GetSpiralPath {

    public List<Integer> solution(int[][] matrix) {

        int n = matrix.length;
        List<Integer> result = new ArrayList<>();
        int x = 0;
        int y = -1;

        while (n > 0) {
            // go down
            for (int i = 0; i < n; i++) {
                y++;
                result.add(matrix[y][x]);
            }
            n--;
            // go right
            for (int i = 0; i < n; i++) {
                x++;
                result.add(matrix[y][x]);
            }
            // go up
            for (int i = 0; i < n; i++) {
                y--;
                result.add(matrix[y][x]);
            }
            n--;
            // go left
            for (int i = 0; i < n; i++) {
                x--;
                result.add(matrix[y][x]);
            }
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        GetSpiralPath getSpiralPath = new GetSpiralPath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrix = new int[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())];
        System.out.println(getSpiralPath.solution(matrix));
    }
}

//    for (int i = 0; i < matrix[0].length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                System.out.println("arr[" + i + "][" + j + "] = " + matrix[i][j]);
//            }
//        }

//for (int i = 0; i < matrix[0].length; i++){
//        for (int j = 0; j <= matrix[i].length - matrix.length; j++) {
//        array.add(matrix[i][j]);
//        }
//        }
//        for (int i = 2; i < matrix[0].length; i++) {
//        for (int j = 1; j < matrix[i].length; j++){
//        array.add(matrix[i][j]);
//        }
//        }
//
//        for (int i = matrix[0].length; i >= matrix[0].length - matrix.length; i--) {
//        for ()
//        }