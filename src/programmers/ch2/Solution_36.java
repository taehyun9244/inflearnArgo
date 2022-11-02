package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 특정 문자 제거하기
 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_36 {

    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replaceAll(letter, "");

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_36 solution_36 = new Solution_36();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        String letter = br.readLine();
        System.out.println(solution_36.solution(my_string, letter));

    }
}
