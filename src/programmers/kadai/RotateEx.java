package programmers.kadai;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RotateEx {
    public static void main(String[] args) {
        int[][] map = new int[3][3];

        int p = 1;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = p++;
            }
        }

        for (int d = 0; d < 4; d++) {
            print(map);
            map = rotate(map);
        }
    }

    private static int[][] rotate(int[][] m) {
        HashSet<Integer> array = new HashSet<>();
        int N = m.length;
        int M = m[0].length;
        // 돌린 크기만큼으로 생성해준다.
        int[][] copyMap = new int[M][N];

        //1
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j <= m[i].length - m.length; j++) {
                array.add(m[i][j]);
                System.out.println("array = " + array);
            }
        }

        //90
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                copyMap[j][N - 1 - i] = m[i][j];

            }
        }

        for (int i = 0; i < copyMap[0].length; i++) {
            for (int j = 0; j <= copyMap[i].length - copyMap.length; j++) {
                array.add(copyMap[i][j]);
                System.out.println("array = " + array);
            }
        }

        //180
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                copyMap[N - i - 1][N - j - 1] = m[i][j];
            }
        }

        for (int i = 0; i < copyMap[0].length; i++) {
            for (int j = 0; j <= copyMap[i].length - copyMap.length; j++) {
                array.add(copyMap[i][j]);
                System.out.println("array = " + array);
            }
        }


        //270
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                copyMap[j][N - i - 1] = m[j][i];
            }
        }

        for (int i = 0; i < copyMap[0].length; i++) {
            for (int j = 0; j <= copyMap[i].length - copyMap.length; j++) {
                array.add(copyMap[i][j]);
                System.out.println("array = " + array);
            }
        }





        // 새로 돌린 배열로 반환해준다.
        System.out.println("array = " + array);
        return null;
    }

    private static void print(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
