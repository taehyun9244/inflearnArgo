package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 세균 증식
 */
public class Solution_21 {

    public int solution(int n, int t) {
        int answer = 0;
        answer = (int) (Math.pow(2, t) * n);

        return answer;
    }


    public static void main(String[] args) throws IOException {
        Solution_21 solution_21 = new Solution_21();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        System.out.println(solution_21.solution(n, t));

    }
}
