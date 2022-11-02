package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 나머지가 1이 되는 수 찾기
 */
public class Solution_9 {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n; i++) {
            if ((n % i) == 1) {
                answer = i;
            } break;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_9 solution_9 = new Solution_9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_9.solution(n));

    }
}
