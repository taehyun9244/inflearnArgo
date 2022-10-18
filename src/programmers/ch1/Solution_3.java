package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 숫자 비교하기
 * 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
 * 0 ≤ num1 ≤ 10,000
 * 0 ≤ num2 ≤ 10,000
 */
class Solution_3 {
    public int solution(int num1, int num2) {
        int answer = 0;

        if (num1 == num2) {
            answer = 1;
        } else answer = -1;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_3 solution_3 = new Solution_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        System.out.println(solution_3.solution(num1, num2));
    }
}


