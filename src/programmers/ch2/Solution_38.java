package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 짝수는 싫어요
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_38 {

    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if ((i % 2) == 1) {
                answer.add(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_38 solution_38 = new Solution_38();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_38.solution(n));
    }
}
