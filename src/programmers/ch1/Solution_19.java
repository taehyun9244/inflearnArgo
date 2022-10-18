package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열 뒤집기
 */
public class Solution_19 {

    public String solution(String my_string) {
        String answer = "";
        answer = new StringBuilder(my_string).reverse().toString();
        return answer;
    }


    public static void main(String[] args) throws IOException {
        Solution_19 solution_19 = new Solution_19();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        System.out.println(solution_19.solution(my_string));
    }
}
