package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 나머지 구하기
 * 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
 * 0 < num1 ≤ 100
 * 0 < num2 ≤ 100
 */
public class Solution_6 {

    public int solution(int num1, int num2) {
        int answer = -1;
        if ((0 < num1 && num1 <= 100) && (0 < num1 && num1 <= 100)) {
            answer = num1%num2;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_6 solution_6 = new Solution_6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        System.out.println(solution_6.solution(num1, num2));
    }
}
