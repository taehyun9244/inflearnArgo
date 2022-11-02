package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 정수 제곱근 판별
 * 문제 설명
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 */
public class Solution_5 {

    public long solution(long n) {
        long answer = 0;
        long sqrt = (long) Math.sqrt(n);

        if ((n == Math.pow(sqrt, 2))) {
            long x = (long) (Math.sqrt(n) + 1);
            answer = (long) Math.pow(x, 2);
        } else  answer = -1;

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_5 solution_5 = new Solution_5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        System.out.println(solution_5.solution(n));

    }
}
