package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 자릿수 더하기
 * 문제 설명
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
public class Solution_4 {

    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        String[] split = str.split("");

        for (int i = 0; i <= split.length-1; i++) {
            int changeN = Integer.parseInt(String.valueOf(split[i]));
            answer += changeN;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_4 solution_4 = new Solution_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_4.solution(n));

    }
}
