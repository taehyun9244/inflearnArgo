package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 편지
 * "happy birthday!" 15 * 2 = 30
 * "I love you~" 11 * 2 = 22
 */
public class Solution_18 {

    public int solution(String message) {
        int answer = 0;

        answer = message.length() * 2;

        return answer;
    }


    public static void main(String[] args) throws IOException {
        Solution_18 solution_18 = new Solution_18();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String message = br.readLine();
        System.out.println(solution_18.solution(message));
    }
}
