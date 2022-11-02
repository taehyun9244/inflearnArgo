package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 평균 구하기
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 */
public class Solution_2 {

    public double solution(int[] arr) {
        double sum = 0;
        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        answer = sum / arr.length;

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_2 solution_2 = new Solution_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[Integer.parseInt(br.readLine())];
        System.out.println(solution_2.solution(arr));

    }
}
