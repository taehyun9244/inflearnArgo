package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 최댓값 만들기(1)
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_31 {

    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        int second = 0;
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                second = numbers[i -1];
                answer = max * second;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_31 solution_31 = new Solution_31();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = new int[Integer.parseInt(br.readLine())];
        System.out.println(solution_31.solution(numbers));

    }

    //TODO 다시 풀어야됨
}
