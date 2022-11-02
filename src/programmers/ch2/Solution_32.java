package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 배열 자르기
 */
public class Solution_32 {

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = Arrays.copyOfRange(numbers, num1, num2);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_32 solution_32 = new Solution_32();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = new int[Integer.parseInt(br.readLine())];
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        System.out.println(solution_32.solution(numbers, num1, num2));

    }
}
