package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피자 나눠 먹기 (1)
 */
public class Solution_17 {

    public int solution(int n) {
        int answer = 0;

        if ((n%7) >=1) {
            answer = (n/7) + 1;
        } else answer = n/7;

        return answer;
    }



    public static void main(String[] args) throws IOException {
        Solution_17 solution_17 = new Solution_17();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_17.solution(n));
    }
}
