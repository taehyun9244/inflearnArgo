package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열을 정수로 바꾸기
 * 문제 설명
 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 */
public class Solution_10 {

    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_10 solution_10 = new Solution_10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution_10.solution(s));

    }
}
