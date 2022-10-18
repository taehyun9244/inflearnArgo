package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 자릿수 더하기
 */
public class Solution_20 {

    public int solution(int n) {
        int answer = 0;
        while (n != 0) {
            answer += n % 10;
            n = n/10;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_20 solution_20 = new Solution_20();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_20.solution(n));
    }
}
