package programmers.ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 순서쌍의 개수
 */
public class Solution_41 {

    public int solution(int n) {
        int answer = 0;
        List<Integer> aliquot = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                aliquot.add(i);
            }
        }
        answer = aliquot.size();
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_41 solution_41 = new Solution_41();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_41.solution(n));
    }
}
