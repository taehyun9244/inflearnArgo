package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 두수의 나눗셈
 * 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
 * 0 < num1 ≤ 100
 * 0 < num2 ≤ 100
 */
public class Solution_11 {

    public double solution(int num1, int num2) {
        double answer = 0;
        answer =  Math.floor(((num1 * 1.0) / (num2 * 1.0)) * 1000);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_11 solution_11 = new Solution_11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        System.out.println(solution_11.solution(num1, num2));

    }
}
