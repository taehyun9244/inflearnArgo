package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 머쓱이보다 키 큰 사람
 */
public class Solution_16 {

    public int solution(int[] array, int height) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_16 solution_16 = new Solution_16();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[Integer.parseInt(br.readLine())];
        int height = Integer.parseInt(br.readLine());
        System.out.println(solution_16.solution(array, height));
    }
}
