package programmers.ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * n의 배수 고르기
 * 문제 설명
 * 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_43 {

    public List<Integer> solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer.add(numlist[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_43 solution_43 = new Solution_43();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int numlist []  = new int[Integer.parseInt(br.readLine())];
        System.out.println(solution_43.solution(n, numlist));
    }
}
