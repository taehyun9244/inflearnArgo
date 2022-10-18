package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 짝수의 합
 * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
 * 0 < n ≤ 1000
 */
public class Solution_10 {
    public int solution(int n) {
            int answer = 0;

            for (int i = 0; i <= n; i ++) {
                if (i % 2 == 0) {
                    answer += i;
                }
            }

            return answer;
    }


    public static void main(String[] args) throws IOException {
        Solution_10 solution_10 = new Solution_10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_10.solution(n));

    }
}
