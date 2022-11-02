package programmers.ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 중앙값 구하기
 */

public class Solution_42 {

    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);

        answer =  array[ array.length / 2 ];
        return answer;

    }

    public static void main(String[] args) throws IOException {
        Solution_42 solution_42 = new Solution_42();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[Integer.parseInt(br.readLine())];
        System.out.println(solution_42.solution(array));
    }
}
