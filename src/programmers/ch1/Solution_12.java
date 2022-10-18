package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 중복된 숫자 갯수
 * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 * 1 ≤ array의 길이 ≤ 100
 * 0 ≤ array의 원소 ≤ 1,000
 * 0 ≤ n ≤ 1,000
 */
public class Solution_12 {

    public int solution(int[] array, int n) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_12 solution_12 = new Solution_12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[Integer.parseInt(br.readLine())];
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_12.solution(array, n));

    }
}
