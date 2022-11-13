package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 없는 숫자 더하기
 문제 설명
 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
 numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 */

//TODO 없는 숫자 더하기
public class Solution_20 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] != i) {
                answer += i;
            }
        }

        return answer;
    }



    public static void main(String[] args) throws IOException {
        Solution_20 solution_20 = new Solution_20();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = new int[Integer.parseInt(br.readLine())];
        System.out.println(solution_20.solution(numbers));
    }
}


