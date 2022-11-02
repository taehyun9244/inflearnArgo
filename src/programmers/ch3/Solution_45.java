package programmers.ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 숨어있는 숫자의 덧셈 (1)
 * 문제 설명
 * 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_45 {

    public int solution(String my_string) {
        int answer = 0;
        String replaceString = my_string.replaceAll("[^0-9]", "");
        System.out.println("replaceString = " + replaceString);

        String[] split = replaceString.split("");
        System.out.println("split = " + split);

        for (int i = 0; i < split.length; i++) {
            int n  = Integer.parseInt(split[i]);
            answer += n;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_45 solution_42 = new Solution_45();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        System.out.println(solution_42.solution(my_string));
    }
}
