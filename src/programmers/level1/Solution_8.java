package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 하샤드 수
 */
public class Solution_8 {

    public boolean solution(int x) {
        boolean answer = true;

        String [] str = String.valueOf(x).split("");
        int sum = 0;

        for (int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
                if ((x % sum) == 0) {
                      answer = true;
                }else answer = false;
            }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_8 solution_8 = new Solution_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.println(solution_8.solution(x));

    }
}
