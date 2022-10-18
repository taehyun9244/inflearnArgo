package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 두 수의 차
 * 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
 * -50000 ≤ num1 ≤ 50000
 * -50000 ≤ num2 ≤ 50000
 */
public class Solution_4 {
    public int solution(int num1, int num2) {
        int answer = 0;

        if (-50000 <= num1 && 50000 >= num1){
            if (-50000 <= num1 && 50000 >= num1){
                answer = num1 - num2;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_4 solution_4 = new Solution_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        System.out.println(solution_4.solution(num1, num2));
    }
}
