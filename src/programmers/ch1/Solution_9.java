package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 배열의 평균값
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 * 0 ≤ numbers의 원소 ≤ 1,000
 * 1 ≤ numbers의 길이 ≤ 100
 * 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
 */
public class Solution_9 {

    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = (double) sum/numbers.length;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_9 solution_9 = new Solution_9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number [] = new int[Integer.parseInt(br.readLine())];
        System.out.println(solution_9.solution(number));
    }
}
