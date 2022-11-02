package programmers.level1;

import programmers.ch2.Solution_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 약수의 합
 * 문제 설명
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 */
public class Solution_3 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i ) == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_3 solution_3 = new Solution_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_3.solution(n));

    }
}
