package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열안에 문자열
 */
public class Solution_22 {

    public int solution(String str1, String str2) {
        int answer = 0;
        if (str1.contains(str2)) {
            answer = 1;
        } else  answer = 2;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_22 solution_22 = new Solution_22();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(solution_22.solution(str1, str2));

    }
}
