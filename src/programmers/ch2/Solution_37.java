package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 약수 구하기
 * 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_37 {

    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                answer.add(i);
            }
        }
        answer.sort(Comparator.naturalOrder());
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_37 solution_37 = new Solution_37();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_37.solution(n));

    }

}
